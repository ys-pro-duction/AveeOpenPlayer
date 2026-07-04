package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbwi;

/* JADX INFO: renamed from: com.daaw.bM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3411bM1 extends AbstractBinderC6674mz1 implements InterfaceC3689cM1 {
    public AbstractBinderC3411bM1() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static InterfaceC3689cM1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3689cM1 ? (InterfaceC3689cM1) iInterfaceQueryLocalInterface : new C3132aM1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i3 = parcel.readInt();
                AbstractC6953nz1.c(parcel);
                b(i3);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (iInterfaceQueryLocalInterface instanceof AbstractC4814gM1) {
                        AbstractC6314li0.a(iInterfaceQueryLocalInterface);
                    }
                }
                AbstractC6953nz1.c(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                AbstractC6953nz1.c(parcel);
                X1(string, string2);
                break;
            case 10:
                PG1.Z2(parcel.readStrongBinder());
                parcel.readString();
                AbstractC6953nz1.c(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                AbstractC6953nz1.c(parcel);
                break;
            case 13:
                i();
                break;
            case 14:
                zzbwi zzbwiVar = (zzbwi) AbstractC6953nz1.a(parcel, zzbwi.CREATOR);
                AbstractC6953nz1.c(parcel);
                B1(zzbwiVar);
                break;
            case 15:
                d();
                break;
            case 16:
                InterfaceC7351pQ1 interfaceC7351pQ1Z2 = AbstractBinderC7072oQ1.Z2(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                B0(interfaceC7351pQ1Z2);
                break;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                int i4 = parcel.readInt();
                AbstractC6953nz1.c(parcel);
                P1(i4);
                break;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                zzu();
                break;
            case 19:
                AbstractC6953nz1.c(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                String string3 = parcel.readString();
                AbstractC6953nz1.c(parcel);
                p(string3);
                break;
            case 22:
                int i5 = parcel.readInt();
                String string4 = parcel.readString();
                AbstractC6953nz1.c(parcel);
                d0(i5, string4);
                break;
            case 23:
                zze zzeVar = (zze) AbstractC6953nz1.a(parcel, zze.CREATOR);
                AbstractC6953nz1.c(parcel);
                l0(zzeVar);
                break;
            case 24:
                zze zzeVar2 = (zze) AbstractC6953nz1.a(parcel, zze.CREATOR);
                AbstractC6953nz1.c(parcel);
                n1(zzeVar2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
