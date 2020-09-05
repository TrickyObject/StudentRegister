package mts.student.view;


public class StudentResponse {

    private boolean studying;
    private String error;

    @Override
    public String toString() {
        return "StudentResponse{" +
                "studying=" + studying +
                ", error='" + error + '\'' +
                '}';
    }

    public boolean isStudying() {
        return studying;
    }

    public void setStudying(boolean studying) {
        this.studying = studying;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
