package nyc.c4q.fragmentsinclass;

import android.os.Bundle;

/**
 * Created by muridjonrahimov on 12/3/17.
 */

public class CheckingInput {
    private String editTextString;
    private Bundle bundle;

    public CheckingInput(String editTextString) {
        this.editTextString = editTextString;

        returnString(editTextString);
    }

    public String getEditTextString() {
        return editTextString;
    }

    public void setEditTextString(String editTextString) {
        this.editTextString = editTextString;
    }

    public Bundle getBundle() {
        return bundle;
    }

    public void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    public void returnString(String str) {

        switch (str) {
            case "one" :
                setEditTextString("Losers type " + str);
                break;
            case "two":
                setEditTextString("Doubble type " + str);
                break;
            case "three":
                setEditTextString("You saved " + str);
                break;
            default: setEditTextString("You Type " + str);


        }
    }
}