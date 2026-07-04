package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.ads.internal.client.zzdq;

/* JADX INFO: renamed from: com.daaw.dK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3960dK1 extends AbstractBinderC6674mz1 implements InterfaceC4238eK1 {
    public AbstractBinderC3960dK1() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC5085hK1 c4517fK1;
        if (i == 3) {
            zzdq zzdqVarZzb = zzb();
            parcel2.writeNoException();
            AbstractC6953nz1.f(parcel2, zzdqVarZzb);
            return true;
        }
        if (i == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        }
        if (i == 5) {
            InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c4517fK1 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                c4517fK1 = iInterfaceQueryLocalInterface instanceof InterfaceC5085hK1 ? (InterfaceC5085hK1) iInterfaceQueryLocalInterface : new C4517fK1(strongBinder);
            }
            AbstractC6953nz1.c(parcel);
            N0(interfaceC7934rXG, c4517fK1);
            parcel2.writeNoException();
            return true;
        }
        if (i == 6) {
            InterfaceC7934rX interfaceC7934rXG2 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
            AbstractC6953nz1.c(parcel);
            zze(interfaceC7934rXG2);
            parcel2.writeNoException();
            return true;
        }
        if (i != 7) {
            return false;
        }
        InterfaceC7311pG1 interfaceC7311pG1Zzc = zzc();
        parcel2.writeNoException();
        AbstractC6953nz1.f(parcel2, interfaceC7311pG1Zzc);
        return true;
    }
}
