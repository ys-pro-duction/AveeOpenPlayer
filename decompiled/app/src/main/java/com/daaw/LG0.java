package com.daaw;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class LG0 {

    public static class a {
        public static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(LG0 lg0) {
            throw null;
        }

        public static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    public static RemoteInput a(LG0 lg0) {
        return a.b(lg0);
    }

    public static RemoteInput[] b(LG0[] lg0Arr) {
        if (lg0Arr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[lg0Arr.length];
        for (int i = 0; i < lg0Arr.length; i++) {
            LG0 lg0 = lg0Arr[i];
            remoteInputArr[i] = a(null);
        }
        return remoteInputArr;
    }
}
