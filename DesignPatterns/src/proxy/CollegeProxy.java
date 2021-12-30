package proxy;

public class CollegeProxy extends College {

    public String login;

    public CollegeProxy(String login) {
        this.login = login;
    }

    @Override
    public String getCollegeName() {
        if (verifyLogin()) {
            return super.getCollegeName();
        }
        return "Invalid";
    }

    @Override
    public String getCourseName() {
        if (verifyLogin()) {
            return super.getCourseName();
        }
        return "Invalid name";
    }

    private boolean verifyLogin() {
        return login == "OK";
    }
}
