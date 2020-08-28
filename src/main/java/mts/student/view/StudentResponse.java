package mts.student.view;


public class StudentResponse {

    private boolean studying;

    public boolean isStudying() {
        return studying;
    }

    public void setStudying(boolean studying) {
        this.studying = studying;
    }

    @Override
    public String toString() {
        return "StudentResponse{" +
                "studying=" + studying +
                '}';
    }
}
