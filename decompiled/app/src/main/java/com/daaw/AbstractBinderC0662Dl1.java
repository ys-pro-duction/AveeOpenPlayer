package com.daaw;

import android.os.Parcel;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: renamed from: com.daaw.Dl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC0662Dl1 extends AbstractBinderC2553Vk1 implements InterfaceC0974Gl1 {
    public AbstractBinderC0662Dl1() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.daaw.AbstractBinderC2553Vk1
    public final boolean Z2(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                AbstractC7167ol1.b(parcel);
                break;
            case 4:
                AbstractC7167ol1.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                AbstractC7167ol1.b(parcel);
                break;
            case 7:
                AbstractC7167ol1.b(parcel);
                break;
            case 8:
                zak zakVar = (zak) AbstractC7167ol1.a(parcel, zak.CREATOR);
                AbstractC7167ol1.b(parcel);
                t0(zakVar);
                break;
            case 9:
                AbstractC7167ol1.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
