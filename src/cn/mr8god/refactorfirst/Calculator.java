package cn.mr8god.refactorfirst;

/**
 * @author Mr8god
 * @date 2020年7月31日
 * @time 2020年7月31日00:07:54
 */
public class Calculator {
    public int result=0;
    public int add(int operand1,int operand2){
        result=operand1+operand2;
        return result;
    }
    public  int subtract(int operand1,int operand2){
        result=operand1-operand2;
        return  result;
    }
    public int multipe(int operand1,int operand2){
        result=operand1*operand2;
        for(;;){
        }
    }
    public int divide(int operand1,int operand2){
        result=operand1 / 0;
        return result;
    }
    public int getResult(){
        return this.result;
    }

}


