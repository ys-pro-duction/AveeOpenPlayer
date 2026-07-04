package com.daaw;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.zzs;

/* JADX INFO: renamed from: com.daaw.ug3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8817ug3 extends WebViewClient {
    public final /* synthetic */ zzs a;

    public C8817ug3(zzs zzsVar) {
        this.a = zzsVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzs zzsVar = this.a;
        if (zzsVar.H != null) {
            try {
                zzsVar.H.zzf(AbstractC5908kG2.d(1, null, null));
            } catch (RemoteException e) {
                AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            }
        }
        zzs zzsVar2 = this.a;
        if (zzsVar2.H != null) {
            try {
                zzsVar2.H.zze(0);
            } catch (RemoteException e2) {
                AbstractC4274eT1.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.a.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zzs zzsVar = this.a;
            if (zzsVar.H != null) {
                try {
                    zzsVar.H.zzf(AbstractC5908kG2.d(3, null, null));
                } catch (RemoteException e) {
                    AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
                }
            }
            zzs zzsVar2 = this.a;
            if (zzsVar2.H != null) {
                try {
                    zzsVar2.H.zze(3);
                } catch (RemoteException e2) {
                    AbstractC4274eT1.zzl("#007 Could not call remote method.", e2);
                }
            }
            this.a.Z2(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzs zzsVar3 = this.a;
            if (zzsVar3.H != null) {
                try {
                    zzsVar3.H.zzf(AbstractC5908kG2.d(1, null, null));
                } catch (RemoteException e3) {
                    AbstractC4274eT1.zzl("#007 Could not call remote method.", e3);
                }
            }
            zzs zzsVar4 = this.a;
            if (zzsVar4.H != null) {
                try {
                    zzsVar4.H.zze(0);
                } catch (RemoteException e4) {
                    AbstractC4274eT1.zzl("#007 Could not call remote method.", e4);
                }
            }
            this.a.Z2(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            zzs zzsVar5 = this.a;
            if (zzsVar5.H != null) {
                try {
                    zzsVar5.H.zzi();
                } catch (RemoteException e5) {
                    AbstractC4274eT1.zzl("#007 Could not call remote method.", e5);
                }
            }
            this.a.Z2(this.a.zzb(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        zzs zzsVar6 = this.a;
        if (zzsVar6.H != null) {
            try {
                zzsVar6.H.zzc();
                this.a.H.zzh();
            } catch (RemoteException e6) {
                AbstractC4274eT1.zzl("#007 Could not call remote method.", e6);
            }
        }
        zzs.i3(this.a, zzs.f3(this.a, str));
        return true;
    }
}
