package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC9004vJ2;
import com.daaw.C0461Bp1;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class zzaeo implements zzbx {
    public static final Parcelable.Creator<zzaeo> CREATOR = new C0461Bp1();
    public final String B;
    public final String C;

    public zzaeo(String str, String str2) {
        this.B = str;
        this.C = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaeo zzaeoVar = (zzaeo) obj;
            if (this.B.equals(zzaeoVar.B) && this.C.equals(zzaeoVar.C)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.B.hashCode() + 527) * 31) + this.C.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    @Override // com.google.android.gms.internal.ads.zzbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(com.daaw.C7064oO1 r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.B
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 4
            r4 = 3
            r5 = 1
            switch(r1) {
                case 62359119: goto L36;
                case 79833656: goto L2c;
                case 428414940: goto L22;
                case 1746739798: goto L18;
                case 1939198791: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L40
        Le:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 1
            goto L41
        L18:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 3
            goto L41
        L22:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 4
            goto L41
        L2c:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 0
            goto L41
        L36:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 2
            goto L41
        L40:
            r0 = -1
        L41:
            if (r0 == 0) goto L64
            if (r0 == r5) goto L5e
            if (r0 == r2) goto L58
            if (r0 == r4) goto L52
            if (r0 == r3) goto L4c
            return
        L4c:
            java.lang.String r0 = r6.C
            r7.z(r0)
            return
        L52:
            java.lang.String r0 = r6.C
            r7.u(r0)
            return
        L58:
            java.lang.String r0 = r6.C
            r7.v(r0)
            return
        L5e:
            java.lang.String r0 = r6.C
            r7.w(r0)
            return
        L64:
            java.lang.String r0 = r6.C
            r7.I(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeo.q(com.daaw.oO1):void");
    }

    public final String toString() {
        return "VC: " + this.B + "=" + this.C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.B);
        parcel.writeString(this.C);
    }

    public zzaeo(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC9004vJ2.a;
        this.B = string;
        this.C = parcel.readString();
    }
}
