package idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.robot;

import idadedocachorro.studio.com.br.idadedocachorro.R;
import idadedocachorro.studio.com.br.idadedocachorro.common.ScreenRobot;

import static idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.constants.ConstantsHome.HEADER_APP;
import static idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.constants.ConstantsHome.IDADE_DOG;
import static idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.constants.ConstantsHome.TXT_BTN;
import static idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.constants.ConstantsHome.TXT_HOME;
import static idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.constants.ConstantsHome.TXT_IDADE;
import static idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.constants.ConstantsHome.TXT_IDADE_VALOR;
import static idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.constants.ConstantsHome.TXT_IDADE_VAZIA;

public class RobotHome extends ScreenRobot<RobotHome> {

    public static final int IMG_DOG = R.id.imageView2;
    public static final int FIELD_YEARS = R.id.numero;
    public static final int BTN_YEARS = R.id.btnIdade;
    public static final int RESULT_IDADE = R.id.resultado;

    public RobotHome checkHeaderAPP(){
        checkViewContainsText(HEADER_APP);
        return this;
    }

    public RobotHome checkTxtHome(){
        checkViewContainsText(TXT_HOME);
        return this;
    }

    public RobotHome checkImgHomeIsDisplayed(){
        checkIsDisplayed(IMG_DOG);
        return this;
    }

    public RobotHome checkFieldYearsHome(){
        checkIsDisplayed(FIELD_YEARS);
        return this;
    }

    public RobotHome checkTxtBtn(){
        checkViewContainsText(TXT_BTN);
        return this;
    }

    public RobotHome checkBtnIsClickable(){
        checkIsClickable(BTN_YEARS);
        return this;
    }

    public RobotHome fillFieldYears(){
        return enterTextIntoView(FIELD_YEARS, IDADE_DOG)
        .closeKeyboard();
    }

    public RobotHome clickOnBtnHome(){
        clickOnView(BTN_YEARS);
        return this;
    }

//  checa resultado por texto
    public RobotHome checkTxtIdade(){
        checkViewContainsText(TXT_IDADE);
        return this;
    }

//    checa resultado por id
    public RobotHome checkIdadeValor(){
        checkViewHasText(RESULT_IDADE, "A idade do cachorro em anos humanos é: 84 Anos");
        return this;
    }

    public RobotHome checkIdadeVazia(){
        checkViewContainsText(TXT_IDADE_VAZIA);
        return this;
    }
}
