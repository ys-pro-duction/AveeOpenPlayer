package com.daaw;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;

/* JADX INFO: renamed from: com.daaw.Ud2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2422Ud2 extends AbstractBinderC7032oG1 {
    public final C7969re2 B;
    public InterfaceC7934rX C;

    public BinderC2422Ud2(C7969re2 c7969re2) {
        this.B = c7969re2;
    }

    public static float Z2(InterfaceC7934rX interfaceC7934rX) {
        Drawable drawable;
        if (interfaceC7934rX == null || (drawable = (Drawable) BinderC7744qp0.I(interfaceC7934rX)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.daaw.InterfaceC7311pG1
    public final void n0(C4226eH1 c4226eH1) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.j6)).booleanValue() && (this.B.W() instanceof UW1)) {
            ((UW1) this.B.W()).e3(c4226eH1);
        }
    }

    @Override // com.daaw.InterfaceC7311pG1
    public final float zze() {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.i6)).booleanValue()) {
            return 0.0f;
        }
        if (this.B.O() != 0.0f) {
            return this.B.O();
        }
        if (this.B.W() != null) {
            try {
                return this.B.W().zze();
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        }
        InterfaceC7934rX interfaceC7934rX = this.C;
        if (interfaceC7934rX != null) {
            return Z2(interfaceC7934rX);
        }
        InterfaceC8147sG1 interfaceC8147sG1Z = this.B.Z();
        if (interfaceC8147sG1Z == null) {
            return 0.0f;
        }
        float fZzd = (interfaceC8147sG1Z.zzd() == -1 || interfaceC8147sG1Z.zzc() == -1) ? 0.0f : interfaceC8147sG1Z.zzd() / interfaceC8147sG1Z.zzc();
        return fZzd == 0.0f ? Z2(interfaceC8147sG1Z.zzf()) : fZzd;
    }

    @Override // com.daaw.InterfaceC7311pG1
    public final float zzf() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.j6)).booleanValue() && this.B.W() != null) {
            return this.B.W().zzf();
        }
        return 0.0f;
    }

    @Override // com.daaw.InterfaceC7311pG1
    public final float zzg() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.j6)).booleanValue() && this.B.W() != null) {
            return this.B.W().zzg();
        }
        return 0.0f;
    }

    @Override // com.daaw.InterfaceC7311pG1
    public final zzdq zzh() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.j6)).booleanValue()) {
            return this.B.W();
        }
        return null;
    }

    @Override // com.daaw.InterfaceC7311pG1
    public final InterfaceC7934rX zzi() {
        InterfaceC7934rX interfaceC7934rX = this.C;
        if (interfaceC7934rX != null) {
            return interfaceC7934rX;
        }
        InterfaceC8147sG1 interfaceC8147sG1Z = this.B.Z();
        if (interfaceC8147sG1Z == null) {
            return null;
        }
        return interfaceC8147sG1Z.zzf();
    }

    @Override // com.daaw.InterfaceC7311pG1
    public final void zzj(InterfaceC7934rX interfaceC7934rX) {
        this.C = interfaceC7934rX;
    }

    @Override // com.daaw.InterfaceC7311pG1
    public final boolean zzk() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.j6)).booleanValue()) {
            return this.B.G();
        }
        return false;
    }

    @Override // com.daaw.InterfaceC7311pG1
    public final boolean zzl() {
        return ((Boolean) zzba.zzc().b(AbstractC9820yE1.j6)).booleanValue() && this.B.W() != null;
    }
}
