package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.AbstractC4274eT1;
import com.daaw.BinderC7744qp0;
import com.daaw.InterfaceC5660jO1;
import com.google.android.gms.ads.internal.client.zzay;

/* JADX INFO: loaded from: classes.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public InterfaceC5660jO1 B;

    public final void a() {
        InterfaceC5660jO1 interfaceC5660jO1 = this.B;
        if (interfaceC5660jO1 != null) {
            try {
                interfaceC5660jO1.zzx();
            } catch (RemoteException e) {
                AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            InterfaceC5660jO1 interfaceC5660jO1 = this.B;
            if (interfaceC5660jO1 != null) {
                interfaceC5660jO1.zzh(i, i2, intent);
            }
        } catch (Exception e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            InterfaceC5660jO1 interfaceC5660jO1 = this.B;
            if (interfaceC5660jO1 != null) {
                if (!interfaceC5660jO1.zzH()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            InterfaceC5660jO1 interfaceC5660jO12 = this.B;
            if (interfaceC5660jO12 != null) {
                interfaceC5660jO12.zzi();
            }
        } catch (RemoteException e2) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            InterfaceC5660jO1 interfaceC5660jO1 = this.B;
            if (interfaceC5660jO1 != null) {
                interfaceC5660jO1.zzk(BinderC7744qp0.Z2(configuration));
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC5660jO1 interfaceC5660jO1Zzo = zzay.zza().zzo(this);
        this.B = interfaceC5660jO1Zzo;
        if (interfaceC5660jO1Zzo == null) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            interfaceC5660jO1Zzo.zzl(bundle);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            InterfaceC5660jO1 interfaceC5660jO1 = this.B;
            if (interfaceC5660jO1 != null) {
                interfaceC5660jO1.zzm();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            InterfaceC5660jO1 interfaceC5660jO1 = this.B;
            if (interfaceC5660jO1 != null) {
                interfaceC5660jO1.zzo();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            InterfaceC5660jO1 interfaceC5660jO1 = this.B;
            if (interfaceC5660jO1 != null) {
                interfaceC5660jO1.zzp(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            InterfaceC5660jO1 interfaceC5660jO1 = this.B;
            if (interfaceC5660jO1 != null) {
                interfaceC5660jO1.zzq();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            InterfaceC5660jO1 interfaceC5660jO1 = this.B;
            if (interfaceC5660jO1 != null) {
                interfaceC5660jO1.zzr();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            InterfaceC5660jO1 interfaceC5660jO1 = this.B;
            if (interfaceC5660jO1 != null) {
                interfaceC5660jO1.zzs(bundle);
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            InterfaceC5660jO1 interfaceC5660jO1 = this.B;
            if (interfaceC5660jO1 != null) {
                interfaceC5660jO1.zzt();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            InterfaceC5660jO1 interfaceC5660jO1 = this.B;
            if (interfaceC5660jO1 != null) {
                interfaceC5660jO1.zzu();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            InterfaceC5660jO1 interfaceC5660jO1 = this.B;
            if (interfaceC5660jO1 != null) {
                interfaceC5660jO1.zzv();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
