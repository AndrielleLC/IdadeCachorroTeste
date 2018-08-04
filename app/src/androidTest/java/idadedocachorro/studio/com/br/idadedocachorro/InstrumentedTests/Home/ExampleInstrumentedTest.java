package idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home;

import android.support.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.robot.RobotHome;
import idadedocachorro.studio.com.br.idadedocachorro.MainActivity;
import idadedocachorro.studio.com.br.idadedocachorro.common.ScreenRobot;

//@RunWith(AndroidJUnit4.class)

public class ExampleInstrumentedTest extends ScreenRobot {

    @Rule
    public ActivityTestRule<MainActivity>
        mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class, false,true);

    @Before
    public void test(){

    }

    @Test
    public void AutomacaoUmEncontrarTodosOsElementosDaTela(){
        new RobotHome()
                .checkImgHomeIsDisplayed()
                .checkFieldYearsHome()
                .checkBtnIsClickable();
    }

    @Test
    public void AutomacaoDoisValidarTodosOsTextosDaTela(){
        new RobotHome()
                .checkHeaderAPP()
                .checkTxtHome()
                .checkTxtBtn();
    }

    @Test
    public void AutomacaoTresValidarTextoComIdadeDoCachorro(){
        new RobotHome()
                .fillFieldYears()
                .clickOnBtnHome()
                .checkTxtIdade()
                .checkIdadeValor();
    }

    @Test
    public void AutomacaoQuatroValidarTextoComIdadeDoCachorroVazia(){
        new RobotHome()
                .checkImgHomeIsDisplayed()
                .checkFieldYearsHome()
                .checkBtnIsClickable()
                .checkHeaderAPP()
                .checkTxtHome()
                .checkTxtBtn()
                .clickOnBtnHome()
                .checkIdadeVazia();
    }
}



