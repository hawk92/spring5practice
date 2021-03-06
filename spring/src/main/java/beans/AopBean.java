package beans;

public class AopBean {

    private SimpleBean simpleBean;

    public AopBean(SimpleBean simpleBean) {
        this.simpleBean = simpleBean;
    }

    public void addValue() {
        simpleBean.setValue("Hello " + simpleBean.getValue());
    }

    public void addValue(String value1, String value2) {
        simpleBean.setValue(simpleBean.getValue() + " " + value1 + " " + value2);
    }

    public String getValue() {
        return simpleBean.getValue();
    }

    public String getValueWithException() throws InterruptedException {
        Thread.sleep(1000);
        throw new NullPointerException("Null pointer");
    }
}
