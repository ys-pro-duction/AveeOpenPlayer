package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzau;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class Pf3 extends F53 {
    public static final String[] g = {"firebase_", "google_", "ga_"};
    public static final String[] h = {"_err"};
    public SecureRandom c;
    public final AtomicLong d;
    public int e;
    public Integer f;

    public Pf3(C9327wU2 c9327wU2) {
        super(c9327wU2);
        this.f = null;
        this.d = new AtomicLong(0L);
    }

    public static boolean Y(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean Z(String str) {
        AbstractC7506py0.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean a0(Context context) {
        ActivityInfo receiverInfo;
        AbstractC7506py0.l(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean b0(Context context, boolean z) {
        AbstractC7506py0.l(context);
        return Build.VERSION.SDK_INT >= 24 ? k0(context, "com.google.android.gms.measurement.AppMeasurementJobService") : k0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean c0(String str) {
        return !h[0].equals(str);
    }

    public static final boolean f0(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static final boolean g0(String str) {
        AbstractC7506py0.l(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    public static boolean j0(String str, String[] strArr) {
        AbstractC7506py0.l(strArr);
        for (String str2 : strArr) {
            if (Kf3.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean k0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static MessageDigest q() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList s(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzacVar = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzacVar.B);
            bundle.putString("origin", zzacVar.C);
            bundle.putLong("creation_timestamp", zzacVar.E);
            bundle.putString("name", zzacVar.D.C);
            K63.b(bundle, AbstractC7506py0.l(zzacVar.D.e()));
            bundle.putBoolean("active", zzacVar.F);
            String str = zzacVar.G;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzau zzauVar = zzacVar.H;
            if (zzauVar != null) {
                bundle.putString("timed_out_event_name", zzauVar.B);
                zzas zzasVar = zzauVar.C;
                if (zzasVar != null) {
                    bundle.putBundle("timed_out_event_params", zzasVar.m());
                }
            }
            bundle.putLong("trigger_timeout", zzacVar.I);
            zzau zzauVar2 = zzacVar.J;
            if (zzauVar2 != null) {
                bundle.putString("triggered_event_name", zzauVar2.B);
                zzas zzasVar2 = zzauVar2.C;
                if (zzasVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzasVar2.m());
                }
            }
            bundle.putLong("triggered_timestamp", zzacVar.D.D);
            bundle.putLong("time_to_live", zzacVar.K);
            zzau zzauVar3 = zzacVar.L;
            if (zzauVar3 != null) {
                bundle.putString("expired_event_name", zzauVar3.B);
                zzas zzasVar3 = zzauVar3.C;
                if (zzasVar3 != null) {
                    bundle.putBundle("expired_event_params", zzasVar3.m());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static long s0(byte[] bArr) {
        AbstractC7506py0.l(bArr);
        int length = bArr.length;
        int i = 0;
        AbstractC7506py0.o(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
        }
        return j;
    }

    public static void y(C5715jb3 c5715jb3, Bundle bundle, boolean z) {
        if (bundle != null && c5715jb3 != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = c5715jb3.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c5715jb3.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c5715jb3.c);
                return;
            }
            z = false;
        }
        if (bundle != null && c5715jb3 == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final void A(Parcelable[] parcelableArr, int i, boolean z) {
        AbstractC7506py0.l(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (Z(str) && !j0(str, B83.d) && (i2 = i2 + 1) > i) {
                    if (z) {
                        this.a.w().o().c("Param can't contain more than " + i + " item-scoped custom parameters", this.a.D().e(str), this.a.D().b(bundle));
                        f0(bundle, 28);
                    } else {
                        this.a.w().o().c("Param cannot contain item-scoped custom parameters", this.a.D().e(str), this.a.D().b(bundle));
                        f0(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final void B(C2092Qz2 c2092Qz2, int i) {
        int i2 = 0;
        for (String str : new TreeSet(c2092Qz2.d.keySet())) {
            if (Z(str) && (i2 = i2 + 1) > i) {
                this.a.w().o().c("Event can't contain more than " + i + " params", this.a.D().d(c2092Qz2.a), this.a.D().b(c2092Qz2.d));
                f0(c2092Qz2.d, 5);
                c2092Qz2.d.remove(str);
            }
        }
    }

    public final void C(Mf3 mf3, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        f0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        mf3.a(str, "_err", bundle);
    }

    public final void D(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.a.w().u().c("Not putting event parameter. Invalid value type. name, type", this.a.D().e(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void E(LV1 lv1, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            lv1.J0(bundle);
        } catch (RemoteException e) {
            this.a.w().t().b("Error returning boolean value to wrapper", e);
        }
    }

    public final void F(LV1 lv1, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            lv1.J0(bundle);
        } catch (RemoteException e) {
            this.a.w().t().b("Error returning bundle list to wrapper", e);
        }
    }

    public final void G(LV1 lv1, Bundle bundle) {
        try {
            lv1.J0(bundle);
        } catch (RemoteException e) {
            this.a.w().t().b("Error returning bundle value to wrapper", e);
        }
    }

    public final void H(LV1 lv1, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            lv1.J0(bundle);
        } catch (RemoteException e) {
            this.a.w().t().b("Error returning byte array to wrapper", e);
        }
    }

    public final void I(LV1 lv1, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            lv1.J0(bundle);
        } catch (RemoteException e) {
            this.a.w().t().b("Error returning int value to wrapper", e);
        }
    }

    public final void J(LV1 lv1, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            lv1.J0(bundle);
        } catch (RemoteException e) {
            this.a.w().t().b("Error returning long value to wrapper", e);
        }
    }

    public final void K(LV1 lv1, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            lv1.J0(bundle);
        } catch (RemoteException e) {
            this.a.w().t().b("Error returning string value to wrapper", e);
        }
    }

    public final void L(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int i;
        int i2;
        Pf3 pf3 = this;
        String str4 = str2;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        C5788jq1 c5788jq1Z = pf3.a.z();
        Cl3.b();
        int i3 = (c5788jq1Z.a.z().B(null, AbstractC1311Jr2.B0) && c5788jq1Z.a.N().X(231100000, true)) ? 35 : 0;
        int i4 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str5)) {
                int iO0 = !z ? pf3.o0(str5) : 0;
                if (iO0 == 0) {
                    iO0 = pf3.n0(str5);
                }
                i = iO0;
            } else {
                i = 0;
            }
            if (i != 0) {
                pf3.u(bundle, i, str5, str5, i == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                Bundle bundle2 = bundle;
                if (pf3.V(bundle2.get(str5))) {
                    pf3.a.w().u().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str4, str3, str5);
                    i2 = 22;
                } else {
                    String str6 = str4;
                    int iO = pf3.O(str, str6, str5, bundle2.get(str5), bundle2, list2, z, false);
                    str4 = str6;
                    bundle2 = bundle2;
                    i2 = iO;
                }
                if (i2 == 0 || "_ev".equals(str5)) {
                    pf3 = this;
                    if (Z(str5) && !j0(str5, B83.d)) {
                        i4++;
                        if (!pf3.X(231100000, true)) {
                            pf3.a.w().o().c("Item array not supported on client's version of Google Play Services (Android Only)", pf3.a.D().d(str4), pf3.a.D().b(bundle2));
                            f0(bundle2, 23);
                            bundle2.remove(str5);
                        } else if (i4 > i3) {
                            Cl3.b();
                            if (pf3.a.z().B(null, AbstractC1311Jr2.B0)) {
                                pf3.a.w().o().c("Item can't contain more than " + i3 + " item-scoped custom params", pf3.a.D().d(str4), pf3.a.D().b(bundle2));
                                f0(bundle2, 28);
                                bundle2.remove(str5);
                            } else {
                                pf3.a.w().o().c("Item cannot contain custom parameters", pf3.a.D().d(str4), pf3.a.D().b(bundle2));
                                f0(bundle2, 23);
                                bundle2.remove(str5);
                            }
                        }
                    }
                } else {
                    pf3 = this;
                    pf3.u(bundle2, i2, str5, str5, bundle2.get(str5));
                    bundle2.remove(str5);
                }
            }
            list2 = list;
        }
    }

    public final boolean M(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (g0(str)) {
                return true;
            }
            if (this.a.m()) {
                this.a.w().o().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C6675mz2.z(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.a.m()) {
                this.a.w().o().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (g0(str2)) {
            return true;
        }
        this.a.w().o().b("Invalid admob_app_id. Analytics disabled.", C6675mz2.z(str2));
        return false;
    }

    public final boolean N(String str, int i, String str2) {
        if (str2 == null) {
            this.a.w().o().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        this.a.w().o().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int O(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Pf3.O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final boolean P(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.a.w().o().b("Name is required and can't be null. Type", str);
            return false;
        }
        AbstractC7506py0.l(str2);
        String[] strArr3 = g;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.a.w().o().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !j0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && j0(str2, strArr2)) {
            return true;
        }
        this.a.w().o().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean Q(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i) {
                this.a.w().u().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean R(String str, String str2) {
        if (str2 == null) {
            this.a.w().o().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.a.w().o().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.a.w().o().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.a.w().o().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean S(String str, String str2) {
        if (str2 == null) {
            this.a.w().o().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.a.w().o().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.a.w().o().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.a.w().o().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean T(String str) {
        d();
        if (C6878nj1.a(this.a.v()).a(str) == 0) {
            return true;
        }
        this.a.w().m().b("Permission not granted", str);
        return false;
    }

    public final boolean U(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strR = this.a.z().r();
        this.a.a();
        return strR.equals(str);
    }

    public final boolean V(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean W(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoF = C6878nj1.a(context).f(str, 64);
            if (packageInfoF == null || (signatureArr = packageInfoF.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            this.a.w().n().b("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            this.a.w().n().b("Error obtaining certificate", e2);
            return true;
        }
    }

    public final boolean X(int i, boolean z) {
        Boolean boolJ = this.a.L().J();
        if (q0() < i / 1000) {
            return (boolJ == null || boolJ.booleanValue()) ? false : true;
        }
        return true;
    }

    public final boolean d0(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            AbstractC7506py0.l(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    @Override // com.daaw.F53
    public final void e() {
        d();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                this.a.w().t().a("Utils falling back to Random for random id");
            }
        }
        this.d.set(jNextLong);
    }

    public final byte[] e0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.daaw.F53
    public final boolean f() {
        return true;
    }

    public final int h0(String str) {
        if ("_ldl".equals(str)) {
            this.a.z();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.a.z();
            return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if ("_lgclid".equals(str)) {
            this.a.z();
            return 100;
        }
        this.a.z();
        return 36;
    }

    public final Object i0(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return n(obj.toString(), i, z);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleW0 = w0((Bundle) parcelable);
                if (!bundleW0.isEmpty()) {
                    arrayList.add(bundleW0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final Object k(String str, Object obj) {
        boolean zEquals = "_ev".equals(str);
        int i = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (zEquals) {
            this.a.z();
            return i0(PSKKeyManager.MAX_KEY_LENGTH_BYTES, obj, true, true);
        }
        if (Y(str)) {
            this.a.z();
        } else {
            this.a.z();
            i = 100;
        }
        return i0(i, obj, false, true);
    }

    public final Object l(String str, Object obj) {
        return "_ldl".equals(str) ? i0(h0(str), obj, true, false) : i0(h0(str), obj, false, false);
    }

    public final int l0(String str, Object obj) {
        return "_ldl".equals(str) ? Q("user property referrer", str, h0(str), obj) : Q("user property", str, h0(str), obj) ? 0 : 7;
    }

    public final String m() {
        byte[] bArr = new byte[16];
        r().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final int m0(String str) {
        if (!R("event", str)) {
            return 2;
        }
        if (!P("event", AbstractC9517x83.a, AbstractC9517x83.b, str)) {
            return 13;
        }
        this.a.z();
        return !N("event", 40, str) ? 2 : 0;
    }

    public final String n(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    public final int n0(String str) {
        if (!R("event param", str)) {
            return 3;
        }
        if (!P("event param", null, null, str)) {
            return 14;
        }
        this.a.z();
        return !N("event param", 40, str) ? 3 : 0;
    }

    public final URL o(long j, String str, String str2, long j2) {
        try {
            AbstractC7506py0.f(str2);
            AbstractC7506py0.f(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 79000L, Integer.valueOf(q0())), str2, str, Long.valueOf(j2));
            if (str.equals(this.a.z().s())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException e) {
            e = e;
            this.a.w().n().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e2) {
            e = e2;
            this.a.w().n().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final int o0(String str) {
        if (!S("event param", str)) {
            return 3;
        }
        if (!P("event param", null, null, str)) {
            return 14;
        }
        this.a.z();
        return !N("event param", 40, str) ? 3 : 0;
    }

    public final int p0(String str) {
        if (!R("user property", str)) {
            return 6;
        }
        if (!P("user property", F83.a, null, str)) {
            return 15;
        }
        this.a.z();
        return !N("user property", 24, str) ? 6 : 0;
    }

    public final int q0() {
        if (this.f == null) {
            this.f = Integer.valueOf(C9599xT.f().a(this.a.v()) / 1000);
        }
        return this.f.intValue();
    }

    public final SecureRandom r() {
        d();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    public final int r0(int i) {
        return C9599xT.f().h(this.a.v(), 12451000);
    }

    public final void t(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.a.w().t().b("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final long t0() {
        long andIncrement;
        long j;
        if (this.d.get() != 0) {
            synchronized (this.d) {
                this.d.compareAndSet(-1L, 1L);
                andIncrement = this.d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.d) {
            long jNextLong = new Random(System.nanoTime() ^ this.a.p().a()).nextLong();
            int i = this.e + 1;
            this.e = i;
            j = jNextLong + ((long) i);
        }
        return j;
    }

    public final void u(Bundle bundle, int i, String str, String str2, Object obj) {
        if (f0(bundle, i)) {
            this.a.z();
            bundle.putString("_ev", n(str, 40, true));
            if (obj != null) {
                AbstractC7506py0.l(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final long u0(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    public final Bundle v0(Uri uri, boolean z) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                    queryParameter5 = uri.getQueryParameter("utm_id");
                    queryParameter6 = uri.getQueryParameter("dclid");
                    queryParameter7 = uri.getQueryParameter("srsltid");
                    queryParameter8 = z ? uri.getQueryParameter("sfmc_id") : null;
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                }
                if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && (!z || TextUtils.isEmpty(queryParameter8))) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("campaign", queryParameter);
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("source", queryParameter2);
                }
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("medium", queryParameter3);
                }
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("gclid", queryParameter4);
                }
                String queryParameter9 = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter9)) {
                    bundle.putString("term", queryParameter9);
                }
                String queryParameter10 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter10)) {
                    bundle.putString("content", queryParameter10);
                }
                String queryParameter11 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter11)) {
                    bundle.putString("aclid", queryParameter11);
                }
                String queryParameter12 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter12)) {
                    bundle.putString("cp1", queryParameter12);
                }
                String queryParameter13 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter13)) {
                    bundle.putString("anid", queryParameter13);
                }
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("campaign_id", queryParameter5);
                }
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("dclid", queryParameter6);
                }
                String queryParameter14 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter14)) {
                    bundle.putString("source_platform", queryParameter14);
                }
                String queryParameter15 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter15)) {
                    bundle.putString("creative_format", queryParameter15);
                }
                String queryParameter16 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter16)) {
                    bundle.putString("marketing_tactic", queryParameter16);
                }
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("srsltid", queryParameter7);
                }
                if (z && !TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("sfmc_id", queryParameter8);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                this.a.w().t().b("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return null;
    }

    public final Bundle w0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objK = k(str, bundle.get(str));
                if (objK == null) {
                    this.a.w().u().b("Param value can't be null", this.a.D().e(str));
                } else {
                    D(bundle2, str, objK);
                }
            }
        }
        return bundle2;
    }

    public final Bundle x0(String str, String str2, Bundle bundle, List list, boolean z) {
        int iO0;
        String str3 = str2;
        List list2 = list;
        boolean zJ0 = j0(str3, AbstractC9517x83.d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int i = this.a.z().i();
        int i2 = 0;
        for (String str4 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str4)) {
                iO0 = !z ? o0(str4) : 0;
                if (iO0 == 0) {
                    iO0 = n0(str4);
                }
            } else {
                iO0 = 0;
            }
            if (iO0 != 0) {
                u(bundle2, iO0, str4, str4, iO0 == 3 ? str4 : null);
                bundle2.remove(str4);
            } else {
                Bundle bundle3 = bundle2;
                String str5 = str3;
                int iO = O(str, str5, str4, bundle.get(str4), bundle3, list2, z, zJ0);
                str3 = str5;
                bundle2 = bundle3;
                if (iO == 17) {
                    u(bundle2, 17, str4, str4, Boolean.FALSE);
                } else if (iO != 0 && !"_ev".equals(str4)) {
                    u(bundle2, iO, iO == 21 ? str3 : str4, str4, bundle.get(str4));
                    bundle2.remove(str4);
                }
                if (Z(str4) && (i2 = i2 + 1) > i) {
                    this.a.w().o().c("Event can't contain more than " + i + " params", this.a.D().d(str3), this.a.D().b(bundle));
                    f0(bundle2, 5);
                    bundle2.remove(str4);
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    public final zzau y0(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m0(str2) != 0) {
            this.a.w().n().b("Invalid conditional property event name", this.a.D().f(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleX0 = x0(str, str2, bundle2, AbstractC1184Im.a("_o"), true);
        if (z) {
            bundleX0 = w0(bundleX0);
        }
        AbstractC7506py0.l(bundleX0);
        return new zzau(str2, new zzas(bundleX0), str3, j);
    }

    public final void z(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.a.N().D(bundle, str, bundle2.get(str));
            }
        }
    }
}
