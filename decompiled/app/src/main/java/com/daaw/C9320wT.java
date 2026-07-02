package com.daaw;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.daaw.AbstractC1401Ko0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: renamed from: com.daaw.wT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9320wT extends C9599xT {
    public String c;
    public static final Object e = new Object();
    public static final C9320wT f = new C9320wT();
    public static final int d = C9599xT.a;

    public static C9320wT n() {
        return f;
    }

    @Override // com.daaw.C9599xT
    public Intent b(Context context, int i, String str) {
        return super.b(context, i, str);
    }

    @Override // com.daaw.C9599xT
    public PendingIntent c(Context context, int i, int i2) {
        return super.c(context, i, i2);
    }

    @Override // com.daaw.C9599xT
    public final String e(int i) {
        return super.e(i);
    }

    @Override // com.daaw.C9599xT
    public int g(Context context) {
        return super.g(context);
    }

    @Override // com.daaw.C9599xT
    public int h(Context context, int i) {
        return super.h(context, i);
    }

    @Override // com.daaw.C9599xT
    public final boolean j(int i) {
        return super.j(i);
    }

    public Dialog l(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return q(activity, i, AbstractDialogInterfaceOnClickListenerC1597Ml1.b(activity, b(activity, i, "d"), i2), onCancelListener, null);
    }

    public PendingIntent m(Context context, ConnectionResult connectionResult) {
        return connectionResult.s() ? connectionResult.p() : c(context, connectionResult.e(), 0);
    }

    public boolean o(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogL = l(activity, i, i2, onCancelListener);
        if (dialogL == null) {
            return false;
        }
        t(activity, dialogL, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void p(Context context, int i) {
        u(context, i, null, d(context, i, 0, "n"));
    }

    public final Dialog q(Context context, int i, AbstractDialogInterfaceOnClickListenerC1597Ml1 abstractDialogInterfaceOnClickListenerC1597Ml1, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(AbstractC6888nl1.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strB = AbstractC6888nl1.b(context, i);
        DialogInterface.OnClickListener onClickListener2 = abstractDialogInterfaceOnClickListenerC1597Ml1;
        if (strB != null) {
            if (abstractDialogInterfaceOnClickListenerC1597Ml1 == null) {
                onClickListener2 = onClickListener;
            }
            builder.setPositiveButton(strB, onClickListener2);
        }
        String strF = AbstractC6888nl1.f(context, i);
        if (strF != null) {
            builder.setTitle(strF);
        }
        String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i));
        new IllegalArgumentException();
        return builder.create();
    }

    public final Dialog r(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(AbstractC6888nl1.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        t(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final C6609ml1 s(Context context, AbstractC6330ll1 abstractC6330ll1) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C6609ml1 c6609ml1 = new C6609ml1(abstractC6330ll1);
        AbstractC4362em1.l(context, c6609ml1, intentFilter);
        c6609ml1.a(context);
        if (i(context, "com.google.android.gms")) {
            return c6609ml1;
        }
        abstractC6330ll1.a();
        c6609ml1.b();
        return null;
    }

    public final void t(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof MP) {
                EZ0.Y1(dialog, onCancelListener).X1(((MP) activity).f0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC7313pH.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void u(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null);
        new IllegalArgumentException();
        if (i == 18) {
            v(context);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String strE = AbstractC6888nl1.e(context, i);
        String strD = AbstractC6888nl1.d(context, i);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) AbstractC7506py0.l(context.getSystemService("notification"));
        AbstractC1401Ko0.d dVarO = new AbstractC1401Ko0.d(context).l(true).e(true).i(strE).o(new AbstractC1401Ko0.b().h(strD));
        if (HB.f(context)) {
            AbstractC7506py0.o(AbstractC7494pv0.e());
            dVarO.n(context.getApplicationInfo().icon).m(2);
            if (HB.g(context)) {
                dVarO.a(AbstractC3652cD0.a, resources.getString(LD0.o), pendingIntent);
            } else {
                dVarO.g(pendingIntent);
            }
        } else {
            dVarO.n(R.drawable.stat_sys_warning).p(resources.getString(LD0.h)).q(System.currentTimeMillis()).g(pendingIntent).h(strD);
        }
        if (AbstractC7494pv0.i()) {
            AbstractC7506py0.o(AbstractC7494pv0.i());
            synchronized (e) {
                str2 = this.c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(LD0.g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(AbstractC10226zi0.a("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            dVarO.f(str2);
        }
        Notification notificationB = dVarO.b();
        if (i == 1 || i == 2 || i == 3) {
            ET.b.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationB);
    }

    public final void v(Context context) {
        new HandlerC0766El1(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean w(Activity activity, InterfaceC1453Lb0 interfaceC1453Lb0, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogQ = q(activity, i, AbstractDialogInterfaceOnClickListenerC1597Ml1.c(interfaceC1453Lb0, b(activity, i, "d"), 2), onCancelListener, null);
        if (dialogQ == null) {
            return false;
        }
        t(activity, dialogQ, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean x(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent pendingIntentM;
        if (AbstractC9195w00.a(context) || (pendingIntentM = m(context, connectionResult)) == null) {
            return false;
        }
        u(context, connectionResult.e(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentM, i, true), AbstractC5209hm1.a | 134217728));
        return true;
    }
}
