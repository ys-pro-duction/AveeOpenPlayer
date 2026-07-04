package com.daaw;

import android.os.RemoteException;
import android.view.View;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Ze2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC2946Ze2 implements View.OnClickListener {
    public final C6023kh2 B;
    public final InterfaceC5485im C;
    public InterfaceC8709uH1 D;
    public HI1 E;
    public String F;
    public Long G;
    public WeakReference H;

    public ViewOnClickListenerC2946Ze2(C6023kh2 c6023kh2, InterfaceC5485im interfaceC5485im) {
        this.B = c6023kh2;
        this.C = interfaceC5485im;
    }

    public final InterfaceC8709uH1 a() {
        return this.D;
    }

    public final void b() {
        if (this.D == null || this.G == null) {
            return;
        }
        d();
        try {
            this.D.zze();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void c(final InterfaceC8709uH1 interfaceC8709uH1) {
        this.D = interfaceC8709uH1;
        HI1 hi1 = this.E;
        if (hi1 != null) {
            this.B.k("/unconfirmedClick", hi1);
        }
        HI1 hi12 = new HI1() { // from class: com.daaw.Ye2
            @Override // com.daaw.HI1
            public final void a(Object obj, Map map) {
                ViewOnClickListenerC2946Ze2 viewOnClickListenerC2946Ze2 = this.a;
                try {
                    viewOnClickListenerC2946Ze2.G = Long.valueOf(Long.parseLong((String) map.get(DiagnosticsEntry.Event.TIMESTAMP_KEY)));
                } catch (NumberFormatException unused) {
                    AbstractC4274eT1.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                InterfaceC8709uH1 interfaceC8709uH12 = interfaceC8709uH1;
                viewOnClickListenerC2946Ze2.F = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (interfaceC8709uH12 == null) {
                    AbstractC4274eT1.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    interfaceC8709uH12.e(str);
                } catch (RemoteException e) {
                    AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
                }
            }
        };
        this.E = hi12;
        this.B.i("/unconfirmedClick", hi12);
    }

    public final void d() {
        View view;
        this.F = null;
        this.G = null;
        WeakReference weakReference = this.H;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.H = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.H;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.F != null && this.G != null) {
            HashMap map = new HashMap();
            map.put("id", this.F);
            map.put("time_interval", String.valueOf(this.C.a() - this.G.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.B.g("sendMessageToNativeJs", map);
        }
        d();
    }
}
