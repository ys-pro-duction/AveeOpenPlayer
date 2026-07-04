package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.daaw.AbstractC7506py0;
import com.daaw.C2599Vw;
import com.daaw.C2865Yk1;
import com.daaw.InterfaceC5485im;
import com.daaw.JM0;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C2865Yk1();
    public static final InterfaceC5485im O = C2599Vw.d();
    public final int B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;
    public final Uri G;
    public String H;
    public final long I;
    public final String J;
    public final List K;
    public final String L;
    public final String M;
    public final Set N = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.B = i;
        this.C = str;
        this.D = str2;
        this.E = str3;
        this.F = str4;
        this.G = uri;
        this.H = str5;
        this.I = j;
        this.J = str6;
        this.K = list;
        this.L = str7;
        this.M = str8;
    }

    public static GoogleSignInAccount H(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), AbstractC7506py0.f(str7), new ArrayList((Collection) AbstractC7506py0.l(set)), str5, str6);
    }

    public static GoogleSignInAccount I(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount googleSignInAccountH = H(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountH.H = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountH;
    }

    public String D() {
        return this.D;
    }

    public Uri E() {
        return this.G;
    }

    public Set F() {
        HashSet hashSet = new HashSet(this.K);
        hashSet.addAll(this.N);
        return hashSet;
    }

    public String G() {
        return this.H;
    }

    public String e() {
        return this.F;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.J.equals(this.J) && googleSignInAccount.F().equals(F());
    }

    public int hashCode() {
        return ((this.J.hashCode() + 527) * 31) + F().hashCode();
    }

    public String m() {
        return this.E;
    }

    public String p() {
        return this.M;
    }

    public String s() {
        return this.L;
    }

    public String v() {
        return this.C;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, this.B);
        JM0.q(parcel, 2, v(), false);
        JM0.q(parcel, 3, D(), false);
        JM0.q(parcel, 4, m(), false);
        JM0.q(parcel, 5, e(), false);
        JM0.p(parcel, 6, E(), i, false);
        JM0.q(parcel, 7, G(), false);
        JM0.n(parcel, 8, this.I);
        JM0.q(parcel, 9, this.J, false);
        JM0.u(parcel, 10, this.K, false);
        JM0.q(parcel, 11, s(), false);
        JM0.q(parcel, 12, p(), false);
        JM0.b(parcel, iA);
    }
}
