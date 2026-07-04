package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.daaw.AbstractBinderC6674mz1;
import com.daaw.AbstractBinderC7602qJ1;
import com.daaw.AbstractC6953nz1;
import com.daaw.C6564mc1;
import com.daaw.CG1;
import com.daaw.InterfaceC3156aS1;
import com.daaw.InterfaceC3697cO1;
import com.daaw.InterfaceC5660jO1;
import com.daaw.InterfaceC7880rJ1;
import com.daaw.InterfaceC7934rX;
import com.daaw.InterfaceC8187sQ1;
import com.daaw.InterfaceC8717uJ1;
import com.daaw.InterfaceC9270wG1;
import com.daaw.RL1;
import com.daaw.SL1;
import com.daaw.YP1;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcd extends AbstractBinderC6674mz1 implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                zzq zzqVar = (zzq) AbstractC6953nz1.a(parcel, zzq.CREATOR);
                String string = parcel.readString();
                SL1 sl1Z2 = RL1.Z2(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                AbstractC6953nz1.c(parcel);
                zzbu zzbuVarZzd = zzd(interfaceC7934rXG, zzqVar, string, sl1Z2, i3);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzbuVarZzd);
                return true;
            case 2:
                InterfaceC7934rX interfaceC7934rXG2 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) AbstractC6953nz1.a(parcel, zzq.CREATOR);
                String string2 = parcel.readString();
                SL1 sl1Z22 = RL1.Z2(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                AbstractC6953nz1.c(parcel);
                zzbu zzbuVarZze = zze(interfaceC7934rXG2, zzqVar2, string2, sl1Z22, i4);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzbuVarZze);
                return true;
            case 3:
                InterfaceC7934rX interfaceC7934rXG3 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                String string3 = parcel.readString();
                SL1 sl1Z23 = RL1.Z2(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                AbstractC6953nz1.c(parcel);
                zzbq zzbqVarZzb = zzb(interfaceC7934rXG3, string3, sl1Z23, i5);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzbqVarZzb);
                return true;
            case 4:
                InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, null);
                return true;
            case 5:
                InterfaceC7934rX interfaceC7934rXG4 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                InterfaceC7934rX interfaceC7934rXG5 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                InterfaceC9270wG1 interfaceC9270wG1Zzi = zzi(interfaceC7934rXG4, interfaceC7934rXG5);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC9270wG1Zzi);
                return true;
            case 6:
                InterfaceC7934rX interfaceC7934rXG6 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                SL1 sl1Z24 = RL1.Z2(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                AbstractC6953nz1.c(parcel);
                YP1 yp1Zzn = zzn(interfaceC7934rXG6, sl1Z24, i6);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, yp1Zzn);
                return true;
            case 7:
                InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, null);
                return true;
            case 8:
                InterfaceC7934rX interfaceC7934rXG7 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                InterfaceC5660jO1 interfaceC5660jO1Zzm = zzm(interfaceC7934rXG7);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC5660jO1Zzm);
                return true;
            case 9:
                InterfaceC7934rX interfaceC7934rXG8 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                AbstractC6953nz1.c(parcel);
                zzco zzcoVarZzg = zzg(interfaceC7934rXG8, i7);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzcoVarZzg);
                return true;
            case 10:
                InterfaceC7934rX interfaceC7934rXG9 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) AbstractC6953nz1.a(parcel, zzq.CREATOR);
                String string4 = parcel.readString();
                int i8 = parcel.readInt();
                AbstractC6953nz1.c(parcel);
                zzbu zzbuVarZzf = zzf(interfaceC7934rXG9, zzqVar3, string4, i8);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzbuVarZzf);
                return true;
            case 11:
                InterfaceC7934rX interfaceC7934rXG10 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                InterfaceC7934rX interfaceC7934rXG11 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                InterfaceC7934rX interfaceC7934rXG12 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                CG1 cg1Zzj = zzj(interfaceC7934rXG10, interfaceC7934rXG11, interfaceC7934rXG12);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, cg1Zzj);
                return true;
            case 12:
                InterfaceC7934rX interfaceC7934rXG13 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                String string5 = parcel.readString();
                SL1 sl1Z25 = RL1.Z2(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                AbstractC6953nz1.c(parcel);
                InterfaceC8187sQ1 interfaceC8187sQ1Zzo = zzo(interfaceC7934rXG13, string5, sl1Z25, i9);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC8187sQ1Zzo);
                return true;
            case 13:
                InterfaceC7934rX interfaceC7934rXG14 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                zzq zzqVar4 = (zzq) AbstractC6953nz1.a(parcel, zzq.CREATOR);
                String string6 = parcel.readString();
                SL1 sl1Z26 = RL1.Z2(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                AbstractC6953nz1.c(parcel);
                zzbu zzbuVarZzc = zzc(interfaceC7934rXG14, zzqVar4, string6, sl1Z26, i10);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzbuVarZzc);
                return true;
            case 14:
                InterfaceC7934rX interfaceC7934rXG15 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                SL1 sl1Z27 = RL1.Z2(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                AbstractC6953nz1.c(parcel);
                InterfaceC3156aS1 interfaceC3156aS1Zzp = zzp(interfaceC7934rXG15, sl1Z27, i11);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC3156aS1Zzp);
                return true;
            case 15:
                InterfaceC7934rX interfaceC7934rXG16 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                SL1 sl1Z28 = RL1.Z2(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                AbstractC6953nz1.c(parcel);
                InterfaceC3697cO1 interfaceC3697cO1Zzl = zzl(interfaceC7934rXG16, sl1Z28, i12);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC3697cO1Zzl);
                return true;
            case 16:
                InterfaceC7934rX interfaceC7934rXG17 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                SL1 sl1Z29 = RL1.Z2(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                InterfaceC7880rJ1 interfaceC7880rJ1Z2 = AbstractBinderC7602qJ1.Z2(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                InterfaceC8717uJ1 interfaceC8717uJ1Zzk = zzk(interfaceC7934rXG17, sl1Z29, i13, interfaceC7880rJ1Z2);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, interfaceC8717uJ1Zzk);
                return true;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                InterfaceC7934rX interfaceC7934rXG18 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                SL1 sl1Z210 = RL1.Z2(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                AbstractC6953nz1.c(parcel);
                zzdj zzdjVarZzh = zzh(interfaceC7934rXG18, sl1Z210, i14);
                parcel2.writeNoException();
                AbstractC6953nz1.f(parcel2, zzdjVarZzh);
                return true;
            default:
                return false;
        }
    }
}
