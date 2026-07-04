package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbrj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class YM1 extends AbstractBinderC6674mz1 implements ZM1 {
    public YM1() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static ZM1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof ZM1 ? (ZM1) iInterfaceQueryLocalInterface : new XM1(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.daaw.YM1, com.daaw.ZM1] */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.daaw.WM1] */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.daaw.TM1] */
    /* JADX WARN: Type inference failed for: r5v19, types: [com.daaw.WM1] */
    /* JADX WARN: Type inference failed for: r5v21, types: [com.daaw.NM1] */
    /* JADX WARN: Type inference failed for: r5v24, types: [com.daaw.TM1] */
    /* JADX WARN: Type inference failed for: r5v28, types: [com.daaw.KM1] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.daaw.NM1] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.daaw.QM1] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.daaw.cN1] */
    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface im1 = null;
        if (i == 1) {
            InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) AbstractC6953nz1.a(parcel, creator);
            Bundle bundle2 = (Bundle) AbstractC6953nz1.a(parcel, creator);
            zzq zzqVar = (zzq) AbstractC6953nz1.a(parcel, zzq.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                im1 = iInterfaceQueryLocalInterface instanceof InterfaceC3693cN1 ? (InterfaceC3693cN1) iInterfaceQueryLocalInterface : new C3136aN1(strongBinder);
            }
            AbstractC6953nz1.c(parcel);
            H2(interfaceC7934rXG, string, bundle, bundle2, zzqVar, im1);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbrj zzbrjVarZzf = zzf();
            parcel2.writeNoException();
            AbstractC6953nz1.e(parcel2, zzbrjVarZzf);
        } else if (i == 3) {
            zzbrj zzbrjVarZzg = zzg();
            parcel2.writeNoException();
            AbstractC6953nz1.e(parcel2, zzbrjVarZzg);
        } else if (i == 5) {
            zzdq zzdqVarZze = zze();
            parcel2.writeNoException();
            AbstractC6953nz1.f(parcel2, zzdqVarZze);
        } else if (i == 10) {
            InterfaceC7934rX.a.G(parcel.readStrongBinder());
            AbstractC6953nz1.c(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    zzl zzlVar = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                    InterfaceC7934rX interfaceC7934rXG2 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        im1 = iInterfaceQueryLocalInterface2 instanceof NM1 ? (NM1) iInterfaceQueryLocalInterface2 : new LM1(strongBinder2);
                    }
                    ?? r5 = im1;
                    InterfaceC3689cM1 interfaceC3689cM1Z2 = AbstractBinderC3411bM1.Z2(parcel.readStrongBinder());
                    zzq zzqVar2 = (zzq) AbstractC6953nz1.a(parcel, zzq.CREATOR);
                    AbstractC6953nz1.c(parcel);
                    Q0(string2, string3, zzlVar, interfaceC7934rXG2, r5, interfaceC3689cM1Z2, zzqVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    zzl zzlVar2 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                    InterfaceC7934rX interfaceC7934rXG3 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        im1 = iInterfaceQueryLocalInterface3 instanceof QM1 ? (QM1) iInterfaceQueryLocalInterface3 : new OM1(strongBinder3);
                    }
                    InterfaceC3689cM1 interfaceC3689cM1Z22 = AbstractBinderC3411bM1.Z2(parcel.readStrongBinder());
                    AbstractC6953nz1.c(parcel);
                    h0(string4, string5, zzlVar2, interfaceC7934rXG3, im1, interfaceC3689cM1Z22);
                    parcel2.writeNoException();
                    break;
                case 15:
                    InterfaceC7934rX interfaceC7934rXG4 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                    AbstractC6953nz1.c(parcel);
                    boolean z = z(interfaceC7934rXG4);
                    parcel2.writeNoException();
                    parcel2.writeInt(z ? 1 : 0);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    zzl zzlVar3 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                    InterfaceC7934rX interfaceC7934rXG5 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        im1 = iInterfaceQueryLocalInterface4 instanceof WM1 ? (WM1) iInterfaceQueryLocalInterface4 : new UM1(strongBinder4);
                    }
                    InterfaceC3689cM1 interfaceC3689cM1Z23 = AbstractBinderC3411bM1.Z2(parcel.readStrongBinder());
                    AbstractC6953nz1.c(parcel);
                    Q2(string6, string7, zzlVar3, interfaceC7934rXG5, im1, interfaceC3689cM1Z23);
                    parcel2.writeNoException();
                    break;
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    InterfaceC7934rX interfaceC7934rXG6 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                    AbstractC6953nz1.c(parcel);
                    boolean zZ1 = z1(interfaceC7934rXG6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZ1 ? 1 : 0);
                    break;
                case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    zzl zzlVar4 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                    InterfaceC7934rX interfaceC7934rXG7 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        im1 = iInterfaceQueryLocalInterface5 instanceof TM1 ? (TM1) iInterfaceQueryLocalInterface5 : new RM1(strongBinder5);
                    }
                    InterfaceC3689cM1 interfaceC3689cM1Z24 = AbstractBinderC3411bM1.Z2(parcel.readStrongBinder());
                    AbstractC6953nz1.c(parcel);
                    f0(string8, string9, zzlVar4, interfaceC7934rXG7, im1, interfaceC3689cM1Z24);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String string10 = parcel.readString();
                    AbstractC6953nz1.c(parcel);
                    G2(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    zzl zzlVar5 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                    InterfaceC7934rX interfaceC7934rXG8 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        im1 = iInterfaceQueryLocalInterface6 instanceof WM1 ? (WM1) iInterfaceQueryLocalInterface6 : new UM1(strongBinder6);
                    }
                    InterfaceC3689cM1 interfaceC3689cM1Z25 = AbstractBinderC3411bM1.Z2(parcel.readStrongBinder());
                    AbstractC6953nz1.c(parcel);
                    Q(string11, string12, zzlVar5, interfaceC7934rXG8, im1, interfaceC3689cM1Z25);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    zzl zzlVar6 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                    InterfaceC7934rX interfaceC7934rXG9 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        im1 = iInterfaceQueryLocalInterface7 instanceof NM1 ? (NM1) iInterfaceQueryLocalInterface7 : new LM1(strongBinder7);
                    }
                    ?? r52 = im1;
                    InterfaceC3689cM1 interfaceC3689cM1Z26 = AbstractBinderC3411bM1.Z2(parcel.readStrongBinder());
                    zzq zzqVar3 = (zzq) AbstractC6953nz1.a(parcel, zzq.CREATOR);
                    AbstractC6953nz1.c(parcel);
                    j1(string13, string14, zzlVar6, interfaceC7934rXG9, r52, interfaceC3689cM1Z26, zzqVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    zzl zzlVar7 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                    InterfaceC7934rX interfaceC7934rXG10 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        im1 = iInterfaceQueryLocalInterface8 instanceof TM1 ? (TM1) iInterfaceQueryLocalInterface8 : new RM1(strongBinder8);
                    }
                    InterfaceC3689cM1 interfaceC3689cM1Z27 = AbstractBinderC3411bM1.Z2(parcel.readStrongBinder());
                    zzbfc zzbfcVar = (zzbfc) AbstractC6953nz1.a(parcel, zzbfc.CREATOR);
                    AbstractC6953nz1.c(parcel);
                    X0(string15, string16, zzlVar7, interfaceC7934rXG10, im1, interfaceC3689cM1Z27, zzbfcVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    zzl zzlVar8 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
                    InterfaceC7934rX interfaceC7934rXG11 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                    IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        im1 = iInterfaceQueryLocalInterface9 instanceof KM1 ? (KM1) iInterfaceQueryLocalInterface9 : new IM1(strongBinder9);
                    }
                    InterfaceC3689cM1 interfaceC3689cM1Z28 = AbstractBinderC3411bM1.Z2(parcel.readStrongBinder());
                    AbstractC6953nz1.c(parcel);
                    K0(string17, string18, zzlVar8, interfaceC7934rXG11, im1, interfaceC3689cM1Z28);
                    parcel2.writeNoException();
                    break;
                case 24:
                    InterfaceC7934rX interfaceC7934rXG12 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                    AbstractC6953nz1.c(parcel);
                    boolean zS = s(interfaceC7934rXG12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zS ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            AbstractC6953nz1.c(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
