package com.daaw;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: com.daaw.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9204w2 extends AbstractC9438ws {

    /* JADX INFO: renamed from: com.daaw.w2$a */
    public class a implements Runnable {
        public final /* synthetic */ String[] B;
        public final /* synthetic */ Activity C;
        public final /* synthetic */ int D;

        public a(String[] strArr, Activity activity, int i) {
            this.B = strArr;
            this.C = activity;
            this.D = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.B.length];
            PackageManager packageManager = this.C.getPackageManager();
            String packageName = this.C.getPackageName();
            int length = this.B.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.B[i], packageName);
            }
            ((c) this.C).onRequestPermissionsResult(this.D, this.B, iArr);
        }
    }

    /* JADX INFO: renamed from: com.daaw.w2$b */
    public static class b {
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: com.daaw.w2$c */
    public interface c {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* JADX INFO: renamed from: com.daaw.w2$d */
    public interface d {
        void b(int i);
    }

    public static /* synthetic */ void l(Activity activity) {
        if (activity.isFinishing() || AbstractC10041z2.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void m(Activity activity) {
        activity.finishAffinity();
    }

    public static void n(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: com.daaw.v2
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC9204w2.l(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void o(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof d) {
                ((d) activity).b(i);
            }
            b.b(activity, strArr, i);
        } else if (activity instanceof c) {
            new Handler(Looper.getMainLooper()).post(new a(strArr2, activity, i));
        }
    }

    public static void p(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void q(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
