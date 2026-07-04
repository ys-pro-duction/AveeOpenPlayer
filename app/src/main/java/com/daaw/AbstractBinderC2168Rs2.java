package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.measurement.internal.zzq;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Rs2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2168Rs2 extends MK1 implements InterfaceC9167vt2 {
    public AbstractBinderC2168Rs2() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.daaw.MK1
    public final boolean B(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                zzau zzauVar = (zzau) AbstractC7888rL1.a(parcel, zzau.CREATOR);
                zzq zzqVar = (zzq) AbstractC7888rL1.a(parcel, zzq.CREATOR);
                AbstractC7888rL1.c(parcel);
                y0(zzauVar, zzqVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzlk zzlkVar = (zzlk) AbstractC7888rL1.a(parcel, zzlk.CREATOR);
                zzq zzqVar2 = (zzq) AbstractC7888rL1.a(parcel, zzq.CREATOR);
                AbstractC7888rL1.c(parcel);
                V2(zzlkVar, zzqVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                zzq zzqVar3 = (zzq) AbstractC7888rL1.a(parcel, zzq.CREATOR);
                AbstractC7888rL1.c(parcel);
                g1(zzqVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzau zzauVar2 = (zzau) AbstractC7888rL1.a(parcel, zzau.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                AbstractC7888rL1.c(parcel);
                W(zzauVar2, string, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                zzq zzqVar4 = (zzq) AbstractC7888rL1.a(parcel, zzq.CREATOR);
                AbstractC7888rL1.c(parcel);
                R(zzqVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzq zzqVar5 = (zzq) AbstractC7888rL1.a(parcel, zzq.CREATOR);
                boolean zF = AbstractC7888rL1.f(parcel);
                AbstractC7888rL1.c(parcel);
                List listG0 = g0(zzqVar5, zF);
                parcel2.writeNoException();
                parcel2.writeTypedList(listG0);
                return true;
            case 9:
                zzau zzauVar3 = (zzau) AbstractC7888rL1.a(parcel, zzau.CREATOR);
                String string3 = parcel.readString();
                AbstractC7888rL1.c(parcel);
                byte[] bArrP2 = P2(zzauVar3, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrP2);
                return true;
            case 10:
                long j = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                AbstractC7888rL1.c(parcel);
                o1(j, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case 11:
                zzq zzqVar6 = (zzq) AbstractC7888rL1.a(parcel, zzq.CREATOR);
                AbstractC7888rL1.c(parcel);
                String strR0 = r0(zzqVar6);
                parcel2.writeNoException();
                parcel2.writeString(strR0);
                break;
            case 12:
                zzac zzacVar = (zzac) AbstractC7888rL1.a(parcel, zzac.CREATOR);
                zzq zzqVar7 = (zzq) AbstractC7888rL1.a(parcel, zzq.CREATOR);
                AbstractC7888rL1.c(parcel);
                r2(zzacVar, zzqVar7);
                parcel2.writeNoException();
                break;
            case 13:
                zzac zzacVar2 = (zzac) AbstractC7888rL1.a(parcel, zzac.CREATOR);
                AbstractC7888rL1.c(parcel);
                e0(zzacVar2);
                parcel2.writeNoException();
                break;
            case 14:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zF2 = AbstractC7888rL1.f(parcel);
                zzq zzqVar8 = (zzq) AbstractC7888rL1.a(parcel, zzq.CREATOR);
                AbstractC7888rL1.c(parcel);
                List listM1 = M1(string7, string8, zF2, zzqVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listM1);
                break;
            case 15:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                boolean zF3 = AbstractC7888rL1.f(parcel);
                AbstractC7888rL1.c(parcel);
                List listB0 = b0(string9, string10, string11, zF3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listB0);
                break;
            case 16:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                zzq zzqVar9 = (zzq) AbstractC7888rL1.a(parcel, zzq.CREATOR);
                AbstractC7888rL1.c(parcel);
                List listH1 = h1(string12, string13, zzqVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listH1);
                break;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                AbstractC7888rL1.c(parcel);
                List listA0 = A0(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listA0);
                break;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                zzq zzqVar10 = (zzq) AbstractC7888rL1.a(parcel, zzq.CREATOR);
                AbstractC7888rL1.c(parcel);
                f2(zzqVar10);
                parcel2.writeNoException();
                break;
            case 19:
                Bundle bundle = (Bundle) AbstractC7888rL1.a(parcel, Bundle.CREATOR);
                zzq zzqVar11 = (zzq) AbstractC7888rL1.a(parcel, zzq.CREATOR);
                AbstractC7888rL1.c(parcel);
                Z(bundle, zzqVar11);
                parcel2.writeNoException();
                break;
            case 20:
                zzq zzqVar12 = (zzq) AbstractC7888rL1.a(parcel, zzq.CREATOR);
                AbstractC7888rL1.c(parcel);
                I1(zzqVar12);
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}
