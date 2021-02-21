package com.example.tp1_appli_mobile;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SecondFragmentArgs implements NavArgs {
    private final HashMap arguments = new HashMap();

    private SecondFragmentArgs() {
    }

    private SecondFragmentArgs(HashMap argumentsMap) {
        this.arguments.putAll(argumentsMap);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public static SecondFragmentArgs fromBundle(@NonNull Bundle bundle) {
        SecondFragmentArgs __result = new SecondFragmentArgs();
        bundle.setClassLoader(SecondFragmentArgs.class.getClassLoader());
        if (bundle.containsKey("key_chapter_id")) {
            int keyChapterId;
            keyChapterId = bundle.getInt("key_chapter_id");
            __result.arguments.put("key_chapter_id", keyChapterId);
        } else {
            __result.arguments.put("key_chapter_id", 0);
        }
        return __result;
    }

    @SuppressWarnings("unchecked")
    public int getKeyChapterId() {
        return (int) arguments.get("key_chapter_id");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle toBundle() {
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
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        SecondFragmentArgs that = (SecondFragmentArgs) object;
        if (arguments.containsKey("key_chapter_id") != that.arguments.containsKey("key_chapter_id")) {
            return false;
        }
        if (getKeyChapterId() != that.getKeyChapterId()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + getKeyChapterId();
        return result;
    }

    @Override
    public String toString() {
        return "SecondFragmentArgs{"
                + "keyChapterId=" + getKeyChapterId()
                + "}";
    }

    public static class Builder {
        private final HashMap arguments = new HashMap();

        public Builder(SecondFragmentArgs original) {
            this.arguments.putAll(original.arguments);
        }

        public Builder() {
        }

        @NonNull
        public SecondFragmentArgs build() {
            SecondFragmentArgs result = new SecondFragmentArgs(arguments);
            return result;
        }

        @NonNull
        public Builder setKeyChapterId(int keyChapterId) {
            this.arguments.put("key_chapter_id", keyChapterId);
            return this;
        }

        @SuppressWarnings("unchecked")
        public int getKeyChapterId() {
            return (int) arguments.get("key_chapter_id");
        }
    }
}
