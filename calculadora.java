import javax.script.*;

public class calculadora {
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    //String resultado = se.eval(String op).toString();

    public calculadora() {

    }

    public String operacions(String op) {
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine se = sem.getEngineByName(op);

        try {
            String resultado = se.eval(op).toString();
            return resultado;
        } catch (ScriptException e) {
            System.out.println("Syntax ERROR");
            return "Syntax ERROR";
        }
    }
}
