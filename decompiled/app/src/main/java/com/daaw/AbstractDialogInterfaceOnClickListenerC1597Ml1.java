package com.daaw;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: renamed from: com.daaw.Ml1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC1597Ml1 implements DialogInterface.OnClickListener {
    public static AbstractDialogInterfaceOnClickListenerC1597Ml1 b(Activity activity, Intent intent, int i) {
        return new C0445Bl1(intent, activity, i);
    }

    public static AbstractDialogInterfaceOnClickListenerC1597Ml1 c(InterfaceC1453Lb0 interfaceC1453Lb0, Intent intent, int i) {
        return new C1494Ll1(intent, interfaceC1453Lb0, 2);
    }

    public abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException unused) {
                Build.FINGERPRINT.contains("generic");
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
