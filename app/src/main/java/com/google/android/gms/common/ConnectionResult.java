package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC8022rp0;
import com.daaw.C6564mc1;
import com.daaw.JM0;
import com.daaw.UC1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    public final int B;
    public final int C;
    public final PendingIntent D;
    public final String E;
    public static final ConnectionResult F = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new UC1();

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.B = i;
        this.C = i2;
        this.D = pendingIntent;
        this.E = str;
    }

    public static String D(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        return "SIGN_IN_FAILED";
                    case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i + ")";
                }
        }
    }

    public int e() {
        return this.C;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.C == connectionResult.C && AbstractC8022rp0.a(this.D, connectionResult.D) && AbstractC8022rp0.a(this.E, connectionResult.E);
    }

    public int hashCode() {
        return AbstractC8022rp0.b(Integer.valueOf(this.C), this.D, this.E);
    }

    public String m() {
        return this.E;
    }

    public PendingIntent p() {
        return this.D;
    }

    public boolean s() {
        return (this.C == 0 || this.D == null) ? false : true;
    }

    public String toString() {
        AbstractC8022rp0.a aVarC = AbstractC8022rp0.c(this);
        aVarC.a("statusCode", D(this.C));
        aVarC.a("resolution", this.D);
        aVarC.a("message", this.E);
        return aVarC.toString();
    }

    public boolean v() {
        return this.C == 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.B;
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, i2);
        JM0.k(parcel, 2, e());
        JM0.p(parcel, 3, p(), i, false);
        JM0.q(parcel, 4, m(), false);
        JM0.b(parcel, iA);
    }

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
