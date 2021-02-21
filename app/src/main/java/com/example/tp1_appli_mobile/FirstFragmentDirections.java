package com.example.tp1_appli_mobile;


import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.tp1_appli_mobile.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FirstFragmentDirections {
    private FirstFragmentDirections() {
    }

    @NonNull
    public static ActionFirstFragmentToSecondFragment actionFirstFragmentToSecondFragment() {
        return new ActionFirstFragmentToSecondFragment();
    }

    public static class ActionFirstFragmentToSecondFragment implements NavDirections {
        private final HashMap arguments = new HashMap();

        private ActionFirstFragmentToSecondFragment() {
        }

        @NonNull
        public ActionFirstFragmentToSecondFragment setKeyChapterId(int keyChapterId) {
            this.arguments.put("key_chapter_id", keyChapterId);
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        @NonNull
        public Bundle getArguments() {
            Bundle __result = new Bundle();
            if (arguments.containsKey("key_chapter_id")) {
                int keyChapterId = (int) arguments.get("key_chapter_id");
                __result.putInt("key_chapter_id", keyChapterId);
            } else {
                __result.putInt("key_chapter_id", 0);
            }
            return __result;
        }

        @Override
        public int getActionId() {
            return R.id.action_FirstFragment_to_SecondFragment;
        }

        @SuppressWarnings("unchecked")
        public int getKeyChapterId() {
            return (int) arguments.get("key_chapter_id");
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object == null || getClass() != object.getClass()) {
                return false;
            }
            ActionFirstFragmentToSecondFragment that = (ActionFirstFragmentToSecondFragment) object;
            if (arguments.containsKey("key_chapter_id") != that.arguments.containsKey("key_chapter_id")) {
                return false;
            }
            if (getKeyChapterId() != that.getKeyChapterId()) {
                return false;
            }
            if (getActionId() != that.getActionId()) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + getKeyChapterId();
            result = 31 * result + getActionId();
            return result;
        }

        @Override
        public String toString() {
            return "ActionFirstFragmentToSecondFragment(actionId=" + getActionId() + "){"
                    + "keyChapterId=" + getKeyChapterId()
                    + "}";
        }
    }
}
