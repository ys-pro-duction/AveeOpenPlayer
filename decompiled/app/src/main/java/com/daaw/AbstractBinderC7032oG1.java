package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.ads.internal.client.zzdq;

/* JADX INFO: renamed from: com.daaw.oG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC7032oG1 extends AbstractBinderC6674mz1 implements InterfaceC7311pG1 {
    public AbstractBinderC7032oG1() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        C4226eH1 c4226eH1;
        switch (i) {
            case 2:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 3:
                InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzj(interfaceC7934rXG);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC7934rX interfaceC7934rXZzi = zzi();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC7934rXZzi);
                return true;
            case 5:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 6:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 7:
                zzdq zzdqVarZzh = zzh();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzdqVarZzh);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC6953nz1.a;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c4226eH1 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    c4226eH1 = iInterfaceQueryLocalInterface instanceof C4226eH1 ? (C4226eH1) iInterfaceQueryLocalInterface : new C4226eH1(strongBinder);
                }
                AbstractC6953nz1.c(parcel);
                n0(c4226eH1);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zZzk = zzk();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC6953nz1.a;
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
