package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzblq;
import com.google.android.gms.internal.ads.zzbrj;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class UL1 extends AbstractBinderC6674mz1 implements ZL1 {
    public UL1() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC3689cM1 c3132aM1;
        InterfaceC3689cM1 c3132aM12;
        InterfaceC3689cM1 c3132aM13;
        InterfaceC3689cM1 c3132aM14;
        InterfaceC3689cM1 c3132aM15;
        InterfaceC3689cM1 c3132aM16;
        InterfaceC3689cM1 c3132aM17;
        InterfaceC3689cM1 c3132aM18;
        InterfaceC3689cM1 c3132aM19 = null;
        switch (i) {
            case 1:
                InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                zzq zzqVar = (zzq) AbstractC6953nz1.a(parcel, zzq.CREATOR);
                zzl zzlVar = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c3132aM1 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3132aM1 = iInterfaceQueryLocalInterface instanceof InterfaceC3689cM1 ? (InterfaceC3689cM1) iInterfaceQueryLocalInterface : new C3132aM1(strongBinder);
                }
                AbstractC6953nz1.c(parcel);
                U(interfaceC7934rXG, zzqVar, zzlVar, string, c3132aM1);
                parcel2.writeNoException();
                return true;
            case 2:
                InterfaceC7934rX interfaceC7934rXZzn = zzn();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC7934rXZzn);
                return true;
            case 3:
                InterfaceC7934rX interfaceC7934rXG2 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                zzl zzlVar2 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    c3132aM12 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3132aM12 = iInterfaceQueryLocalInterface2 instanceof InterfaceC3689cM1 ? (InterfaceC3689cM1) iInterfaceQueryLocalInterface2 : new C3132aM1(strongBinder2);
                }
                AbstractC6953nz1.c(parcel);
                B2(interfaceC7934rXG2, zzlVar2, string2, c3132aM12);
                parcel2.writeNoException();
                return true;
            case 4:
                f();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC7934rX interfaceC7934rXG3 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) AbstractC6953nz1.a(parcel, zzq.CREATOR);
                zzl zzlVar3 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    c3132aM13 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3132aM13 = iInterfaceQueryLocalInterface3 instanceof InterfaceC3689cM1 ? (InterfaceC3689cM1) iInterfaceQueryLocalInterface3 : new C3132aM1(strongBinder3);
                }
                AbstractC6953nz1.c(parcel);
                t2(interfaceC7934rXG3, zzqVar2, zzlVar3, string3, string4, c3132aM13);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC7934rX interfaceC7934rXG4 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                zzl zzlVar4 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    c3132aM14 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3132aM14 = iInterfaceQueryLocalInterface4 instanceof InterfaceC3689cM1 ? (InterfaceC3689cM1) iInterfaceQueryLocalInterface4 : new C3132aM1(strongBinder4);
                }
                AbstractC6953nz1.c(parcel);
                D1(interfaceC7934rXG4, zzlVar4, string5, string6, c3132aM14);
                parcel2.writeNoException();
                return true;
            case 8:
                zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                h();
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC7934rX interfaceC7934rXG5 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                zzl zzlVar5 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                String string7 = parcel.readString();
                InterfaceC6235lQ1 interfaceC6235lQ1Z2 = AbstractBinderC5947kQ1.Z2(parcel.readStrongBinder());
                String string8 = parcel.readString();
                AbstractC6953nz1.c(parcel);
                K(interfaceC7934rXG5, zzlVar5, string7, interfaceC6235lQ1Z2, string8);
                parcel2.writeNoException();
                return true;
            case 11:
                zzl zzlVar6 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                String string9 = parcel.readString();
                AbstractC6953nz1.c(parcel);
                j2(zzlVar6, string9);
                parcel2.writeNoException();
                return true;
            case 12:
                c();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzN = zzN();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC6953nz1.a;
                parcel2.writeInt(zZzN ? 1 : 0);
                return true;
            case 14:
                InterfaceC7934rX interfaceC7934rXG6 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                zzl zzlVar7 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    c3132aM15 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3132aM15 = iInterfaceQueryLocalInterface5 instanceof InterfaceC3689cM1 ? (InterfaceC3689cM1) iInterfaceQueryLocalInterface5 : new C3132aM1(strongBinder5);
                }
                zzbfc zzbfcVar = (zzbfc) AbstractC6953nz1.a(parcel, zzbfc.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                AbstractC6953nz1.c(parcel);
                d2(interfaceC7934rXG6, zzlVar7, string10, string11, c3132aM15, zzbfcVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, null);
                return true;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                Bundle bundleZze = zze();
                parcel2.writeNoException();
                AbstractC6953nz1.e(parcel2, bundleZze);
                return true;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                AbstractC6953nz1.e(parcel2, bundleZzf);
                return true;
            case 19:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                AbstractC6953nz1.e(parcel2, bundleZzg);
                return true;
            case 20:
                zzl zzlVar8 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                AbstractC6953nz1.c(parcel);
                Y2(zzlVar8, string12, string13);
                parcel2.writeNoException();
                return true;
            case 21:
                InterfaceC7934rX interfaceC7934rXG7 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                g2(interfaceC7934rXG7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC6953nz1.a;
                parcel2.writeInt(0);
                return true;
            case 23:
                InterfaceC7934rX interfaceC7934rXG8 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                InterfaceC6235lQ1 interfaceC6235lQ1Z22 = AbstractBinderC5947kQ1.Z2(parcel.readStrongBinder());
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                AbstractC6953nz1.c(parcel);
                V1(interfaceC7934rXG8, interfaceC6235lQ1Z22, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                QG1 qg1Zzi = zzi();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, qg1Zzi);
                return true;
            case 25:
                boolean zG = AbstractC6953nz1.g(parcel);
                AbstractC6953nz1.c(parcel);
                K1(zG);
                parcel2.writeNoException();
                return true;
            case 26:
                zzdq zzdqVarZzh = zzh();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzdqVarZzh);
                return true;
            case 27:
                InterfaceC6219lM1 interfaceC6219lM1Zzk = zzk();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC6219lM1Zzk);
                return true;
            case 28:
                InterfaceC7934rX interfaceC7934rXG9 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                zzl zzlVar9 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    c3132aM16 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3132aM16 = iInterfaceQueryLocalInterface6 instanceof InterfaceC3689cM1 ? (InterfaceC3689cM1) iInterfaceQueryLocalInterface6 : new C3132aM1(strongBinder6);
                }
                AbstractC6953nz1.c(parcel);
                W0(interfaceC7934rXG9, zzlVar9, string14, c3132aM16);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                InterfaceC7934rX interfaceC7934rXG10 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                J1(interfaceC7934rXG10);
                parcel2.writeNoException();
                return true;
            case 31:
                InterfaceC7934rX interfaceC7934rXG11 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                VJ1 vj1Z2 = UJ1.Z2(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzblq.CREATOR);
                AbstractC6953nz1.c(parcel);
                w2(interfaceC7934rXG11, vj1Z2, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                InterfaceC7934rX interfaceC7934rXG12 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                zzl zzlVar10 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                String string15 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 == null) {
                    c3132aM17 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3132aM17 = iInterfaceQueryLocalInterface7 instanceof InterfaceC3689cM1 ? (InterfaceC3689cM1) iInterfaceQueryLocalInterface7 : new C3132aM1(strongBinder7);
                }
                AbstractC6953nz1.c(parcel);
                x1(interfaceC7934rXG12, zzlVar10, string15, c3132aM17);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbrj zzbrjVarZzl = zzl();
                parcel2.writeNoException();
                AbstractC6953nz1.e(parcel2, zzbrjVarZzl);
                return true;
            case 34:
                zzbrj zzbrjVarZzm = zzm();
                parcel2.writeNoException();
                AbstractC6953nz1.e(parcel2, zzbrjVarZzm);
                return true;
            case 35:
                InterfaceC7934rX interfaceC7934rXG13 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) AbstractC6953nz1.a(parcel, zzq.CREATOR);
                zzl zzlVar11 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 == null) {
                    c3132aM18 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3132aM18 = iInterfaceQueryLocalInterface8 instanceof InterfaceC3689cM1 ? (InterfaceC3689cM1) iInterfaceQueryLocalInterface8 : new C3132aM1(strongBinder8);
                }
                AbstractC6953nz1.c(parcel);
                O1(interfaceC7934rXG13, zzqVar3, zzlVar11, string16, string17, c3132aM18);
                parcel2.writeNoException();
                return true;
            case 36:
                InterfaceC4525fM1 interfaceC4525fM1Zzj = zzj();
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC4525fM1Zzj);
                return true;
            case 37:
                InterfaceC7934rX interfaceC7934rXG14 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                v1(interfaceC7934rXG14);
                parcel2.writeNoException();
                return true;
            case 38:
                InterfaceC7934rX interfaceC7934rXG15 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                zzl zzlVar12 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                String string18 = parcel.readString();
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3132aM19 = iInterfaceQueryLocalInterface9 instanceof InterfaceC3689cM1 ? (InterfaceC3689cM1) iInterfaceQueryLocalInterface9 : new C3132aM1(strongBinder9);
                }
                AbstractC6953nz1.c(parcel);
                M0(interfaceC7934rXG15, zzlVar12, string18, c3132aM19);
                parcel2.writeNoException();
                return true;
            case 39:
                InterfaceC7934rX interfaceC7934rXG16 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                G0(interfaceC7934rXG16);
                parcel2.writeNoException();
                return true;
        }
    }
}
