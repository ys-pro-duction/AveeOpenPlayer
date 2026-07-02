package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.daaw.IM0;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzq;
import com.revenuecat.purchases.common.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class Af3 extends Be3 {
    public Af3(C8812uf3 c8812uf3) {
        super(c8812uf3);
    }

    public static Ig3 E(Ig3 ig3, byte[] bArr) {
        C5171he3 c5171he3A = C5171he3.a();
        return c5171he3A != null ? ig3.U(bArr, c5171he3A) : ig3.R(bArr);
    }

    public static List J(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static boolean N(List list, int i) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static boolean P(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void i(IN2 in2, String str, Object obj) {
        List listG = in2.G();
        int i = 0;
        while (true) {
            if (i >= listG.size()) {
                i = -1;
                break;
            } else if (str.equals(((C9869yQ2) listG.get(i)).H())) {
                break;
            } else {
                i++;
            }
        }
        WP2 wp2F = C9869yQ2.F();
        wp2F.z(str);
        if (obj instanceof Long) {
            wp2F.y(((Long) obj).longValue());
        }
        if (i >= 0) {
            in2.z(i, wp2F);
        } else {
            in2.u(wp2F);
        }
    }

    public static final boolean j(zzau zzauVar, zzq zzqVar) {
        AbstractC7506py0.l(zzauVar);
        AbstractC7506py0.l(zzqVar);
        return (TextUtils.isEmpty(zzqVar.C) && TextUtils.isEmpty(zzqVar.R)) ? false : true;
    }

    public static final C9869yQ2 k(C6507mO2 c6507mO2, String str) {
        for (C9869yQ2 c9869yQ2 : c6507mO2.J()) {
            if (c9869yQ2.H().equals(str)) {
                return c9869yQ2;
            }
        }
        return null;
    }

    public static final Object l(C6507mO2 c6507mO2, String str) {
        C9869yQ2 c9869yQ2K = k(c6507mO2, str);
        if (c9869yQ2K == null) {
            return null;
        }
        if (c9869yQ2K.a0()) {
            return c9869yQ2K.I();
        }
        if (c9869yQ2K.Y()) {
            return Long.valueOf(c9869yQ2K.E());
        }
        if (c9869yQ2K.W()) {
            return Double.valueOf(c9869yQ2K.B());
        }
        if (c9869yQ2K.D() <= 0) {
            return null;
        }
        List<C9869yQ2> listJ = c9869yQ2K.J();
        ArrayList arrayList = new ArrayList();
        for (C9869yQ2 c9869yQ2 : listJ) {
            if (c9869yQ2 != null) {
                Bundle bundle = new Bundle();
                for (C9869yQ2 c9869yQ22 : c9869yQ2.J()) {
                    if (c9869yQ22.a0()) {
                        bundle.putString(c9869yQ22.H(), c9869yQ22.I());
                    } else if (c9869yQ22.Y()) {
                        bundle.putLong(c9869yQ22.H(), c9869yQ22.E());
                    } else if (c9869yQ22.W()) {
                        bundle.putDouble(c9869yQ22.H(), c9869yQ22.B());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void o(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final String q(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static final void r(StringBuilder sb, int i, String str, C6822nX2 c6822nX2) {
        if (c6822nX2 == null) {
            return;
        }
        o(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (c6822nX2.C() != 0) {
            o(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : c6822nX2.J()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (c6822nX2.E() != 0) {
            o(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : c6822nX2.L()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (c6822nX2.B() != 0) {
            o(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (C5098hN2 c5098hN2 : c6822nX2.I()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(c5098hN2.I() ? Integer.valueOf(c5098hN2.B()) : null);
                sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                sb.append(c5098hN2.H() ? Long.valueOf(c5098hN2.C()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (c6822nX2.D() != 0) {
            o(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (C9064vY2 c9064vY2 : c6822nX2.K()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(c9064vY2.J() ? Integer.valueOf(c9064vY2.C()) : null);
                sb.append(": [");
                Iterator it = c9064vY2.G().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        o(sb, 3);
        sb.append("}\n");
    }

    public static final void s(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        o(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void t(StringBuilder sb, int i, String str, C3583by2 c3583by2) {
        if (c3583by2 == null) {
            return;
        }
        o(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (c3583by2.H()) {
            int iM = c3583by2.M();
            s(sb, i, "comparison_type", iM != 1 ? iM != 2 ? iM != 3 ? iM != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (c3583by2.J()) {
            s(sb, i, "match_as_float", Boolean.valueOf(c3583by2.G()));
        }
        if (c3583by2.I()) {
            s(sb, i, "comparison_value", c3583by2.D());
        }
        if (c3583by2.L()) {
            s(sb, i, "min_comparison_value", c3583by2.F());
        }
        if (c3583by2.K()) {
            s(sb, i, "max_comparison_value", c3583by2.E());
        }
        o(sb, i);
        sb.append("}\n");
    }

    public static int u(QT2 qt2, String str) {
        for (int i = 0; i < qt2.r0(); i++) {
            if (str.equals(qt2.l0(i).G())) {
                return i;
            }
        }
        return -1;
    }

    public final Bundle A(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(A((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public final Parcelable B(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (IM0.a unused) {
            this.a.w().n().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final zzau C(C1498Lm1 c1498Lm1) {
        Object obj;
        Bundle bundleA = A(c1498Lm1.e(), true);
        String string = (!bundleA.containsKey("_o") || (obj = bundleA.get("_o")) == null) ? "app" : obj.toString();
        String strB = AbstractC9517x83.b(c1498Lm1.d());
        if (strB == null) {
            strB = c1498Lm1.d();
        }
        return new zzau(strB, new zzas(bundleA), string, c1498Lm1.a());
    }

    public final C6507mO2 D(C1845Ov1 c1845Ov1) {
        IN2 in2F = C6507mO2.F();
        in2F.B(c1845Ov1.e);
        C3300ax1 c3300ax1 = new C3300ax1(c1845Ov1.f);
        while (c3300ax1.hasNext()) {
            String next = c3300ax1.next();
            WP2 wp2F = C9869yQ2.F();
            wp2F.z(next);
            Object objV = c1845Ov1.f.v(next);
            AbstractC7506py0.l(objV);
            L(wp2F, objV);
            in2F.u(wp2F);
        }
        return (C6507mO2) in2F.l();
    }

    public final String F(C6527mT2 c6527mT2) {
        if (c6527mT2 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (C8762uU2 c8762uU2 : c6527mT2.E()) {
            if (c8762uU2 != null) {
                o(sb, 1);
                sb.append("bundle {\n");
                if (c8762uU2.s1()) {
                    s(sb, 1, "protocol_version", Integer.valueOf(c8762uU2.C1()));
                }
                C6054kn3.b();
                if (this.a.z().B(c8762uU2.W1(), AbstractC1311Jr2.q0) && c8762uU2.v1()) {
                    s(sb, 1, "session_stitching_token", c8762uU2.M());
                }
                s(sb, 1, "platform", c8762uU2.K());
                if (c8762uU2.o1()) {
                    s(sb, 1, "gmp_version", Long.valueOf(c8762uU2.K1()));
                }
                if (c8762uU2.A1()) {
                    s(sb, 1, "uploading_gmp_version", Long.valueOf(c8762uU2.Q1()));
                }
                if (c8762uU2.m1()) {
                    s(sb, 1, "dynamite_version", Long.valueOf(c8762uU2.I1()));
                }
                if (c8762uU2.j1()) {
                    s(sb, 1, "config_version", Long.valueOf(c8762uU2.G1()));
                }
                s(sb, 1, "gmp_app_id", c8762uU2.H());
                s(sb, 1, "admob_app_id", c8762uU2.V1());
                s(sb, 1, "app_id", c8762uU2.W1());
                s(sb, 1, "app_version", c8762uU2.C());
                if (c8762uU2.h1()) {
                    s(sb, 1, "app_version_major", Integer.valueOf(c8762uU2.d0()));
                }
                s(sb, 1, "firebase_instance_id", c8762uU2.G());
                if (c8762uU2.l1()) {
                    s(sb, 1, "dev_cert_hash", Long.valueOf(c8762uU2.H1()));
                }
                s(sb, 1, "app_store", c8762uU2.B());
                if (c8762uU2.z1()) {
                    s(sb, 1, "upload_timestamp_millis", Long.valueOf(c8762uU2.P1()));
                }
                if (c8762uU2.w1()) {
                    s(sb, 1, "start_timestamp_millis", Long.valueOf(c8762uU2.N1()));
                }
                if (c8762uU2.n1()) {
                    s(sb, 1, "end_timestamp_millis", Long.valueOf(c8762uU2.J1()));
                }
                if (c8762uU2.r1()) {
                    s(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c8762uU2.M1()));
                }
                if (c8762uU2.q1()) {
                    s(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c8762uU2.L1()));
                }
                s(sb, 1, "app_instance_id", c8762uU2.X1());
                s(sb, 1, "resettable_device_id", c8762uU2.L());
                s(sb, 1, "ds_id", c8762uU2.F());
                if (c8762uU2.p1()) {
                    s(sb, 1, "limited_ad_tracking", Boolean.valueOf(c8762uU2.C0()));
                }
                s(sb, 1, "os_version", c8762uU2.J());
                s(sb, 1, "device_model", c8762uU2.E());
                s(sb, 1, "user_default_language", c8762uU2.N());
                if (c8762uU2.y1()) {
                    s(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c8762uU2.E1()));
                }
                if (c8762uU2.i1()) {
                    s(sb, 1, "bundle_sequential_index", Integer.valueOf(c8762uU2.e1()));
                }
                if (c8762uU2.u1()) {
                    s(sb, 1, "service_upload", Boolean.valueOf(c8762uU2.D0()));
                }
                s(sb, 1, "health_monitor", c8762uU2.I());
                if (c8762uU2.t1()) {
                    s(sb, 1, "retry_counter", Integer.valueOf(c8762uU2.D1()));
                }
                if (c8762uU2.k1()) {
                    s(sb, 1, "consent_signals", c8762uU2.D());
                }
                C4932gm3.b();
                if (this.a.z().B(null, AbstractC1311Jr2.G0) && c8762uU2.x1()) {
                    s(sb, 1, "target_os_version", Long.valueOf(c8762uU2.O1()));
                }
                List<DZ2> listQ = c8762uU2.Q();
                if (listQ != null) {
                    for (DZ2 dz2 : listQ) {
                        if (dz2 != null) {
                            o(sb, 2);
                            sb.append("user_property {\n");
                            s(sb, 2, "set_timestamp_millis", dz2.T() ? Long.valueOf(dz2.D()) : null);
                            s(sb, 2, "name", this.a.D().f(dz2.G()));
                            s(sb, 2, "string_value", dz2.H());
                            s(sb, 2, "int_value", dz2.S() ? Long.valueOf(dz2.C()) : null);
                            s(sb, 2, "double_value", dz2.Q() ? Double.valueOf(dz2.B()) : null);
                            o(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C3969dM2> listO = c8762uU2.O();
                if (listO != null) {
                    for (C3969dM2 c3969dM2 : listO) {
                        if (c3969dM2 != null) {
                            o(sb, 2);
                            sb.append("audience_membership {\n");
                            if (c3969dM2.L()) {
                                s(sb, 2, "audience_id", Integer.valueOf(c3969dM2.B()));
                            }
                            if (c3969dM2.M()) {
                                s(sb, 2, "new_audience", Boolean.valueOf(c3969dM2.K()));
                            }
                            r(sb, 2, "current_data", c3969dM2.E());
                            if (c3969dM2.N()) {
                                r(sb, 2, "previous_data", c3969dM2.F());
                            }
                            o(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C6507mO2> listP = c8762uU2.P();
                if (listP != null) {
                    for (C6507mO2 c6507mO2 : listP) {
                        if (c6507mO2 != null) {
                            o(sb, 2);
                            sb.append("event {\n");
                            s(sb, 2, "name", this.a.D().d(c6507mO2.I()));
                            if (c6507mO2.W()) {
                                s(sb, 2, "timestamp_millis", Long.valueOf(c6507mO2.E()));
                            }
                            if (c6507mO2.V()) {
                                s(sb, 2, "previous_timestamp_millis", Long.valueOf(c6507mO2.D()));
                            }
                            if (c6507mO2.T()) {
                                s(sb, 2, "count", Integer.valueOf(c6507mO2.B()));
                            }
                            if (c6507mO2.C() != 0) {
                                m(sb, 2, c6507mO2.J());
                            }
                            o(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                o(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    public final String G(C2798Xt2 c2798Xt2) {
        if (c2798Xt2 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (c2798Xt2.P()) {
            s(sb, 0, "filter_id", Integer.valueOf(c2798Xt2.C()));
        }
        s(sb, 0, "event_name", this.a.D().d(c2798Xt2.H()));
        String strQ = q(c2798Xt2.L(), c2798Xt2.M(), c2798Xt2.N());
        if (!strQ.isEmpty()) {
            s(sb, 0, "filter_type", strQ);
        }
        if (c2798Xt2.O()) {
            t(sb, 1, "event_count_filter", c2798Xt2.G());
        }
        if (c2798Xt2.B() > 0) {
            sb.append("  filters {\n");
            Iterator it = c2798Xt2.I().iterator();
            while (it.hasNext()) {
                n(sb, 2, (C4696fv2) it.next());
            }
        }
        o(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    public final String H(C6117kz2 c6117kz2) {
        if (c6117kz2 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (c6117kz2.K()) {
            s(sb, 0, "filter_id", Integer.valueOf(c6117kz2.B()));
        }
        s(sb, 0, "property_name", this.a.D().f(c6117kz2.F()));
        String strQ = q(c6117kz2.H(), c6117kz2.I(), c6117kz2.J());
        if (!strQ.isEmpty()) {
            s(sb, 0, "filter_type", strQ);
        }
        n(sb, 1, c6117kz2.C());
        sb.append("}\n");
        return sb.toString();
    }

    public final List I(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.a.w().t().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.a.w().t().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final Map K(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(K((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(K((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(K((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public final void L(WP2 wp2, Object obj) {
        AbstractC7506py0.l(obj);
        wp2.w();
        wp2.u();
        wp2.t();
        wp2.v();
        if (obj instanceof String) {
            wp2.A((String) obj);
            return;
        }
        if (obj instanceof Long) {
            wp2.y(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            wp2.x(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.a.w().n().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                WP2 wp2F = C9869yQ2.F();
                for (String str : bundle.keySet()) {
                    WP2 wp2F2 = C9869yQ2.F();
                    wp2F2.z(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        wp2F2.y(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        wp2F2.A((String) obj2);
                    } else if (obj2 instanceof Double) {
                        wp2F2.x(((Double) obj2).doubleValue());
                    }
                    wp2F.r(wp2F2);
                }
                if (wp2F.p() > 0) {
                    arrayList.add((C9869yQ2) wp2F.l());
                }
            }
        }
        wp2.q(arrayList);
    }

    public final void M(ZY2 zy2, Object obj) {
        AbstractC7506py0.l(obj);
        zy2.r();
        zy2.q();
        zy2.p();
        if (obj instanceof String) {
            zy2.x((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zy2.u(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zy2.t(((Double) obj).doubleValue());
        } else {
            this.a.w().n().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final boolean O(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.a.p().a() - j) > j2;
    }

    public final byte[] Q(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.a.w().n().b("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // com.daaw.Be3
    public final boolean h() {
        return false;
    }

    public final void m(StringBuilder sb, int i, List list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9869yQ2 c9869yQ2 = (C9869yQ2) it.next();
            if (c9869yQ2 != null) {
                o(sb, i2);
                sb.append("param {\n");
                s(sb, i2, "name", c9869yQ2.Z() ? this.a.D().e(c9869yQ2.H()) : null);
                s(sb, i2, "string_value", c9869yQ2.a0() ? c9869yQ2.I() : null);
                s(sb, i2, "int_value", c9869yQ2.Y() ? Long.valueOf(c9869yQ2.E()) : null);
                s(sb, i2, "double_value", c9869yQ2.W() ? Double.valueOf(c9869yQ2.B()) : null);
                if (c9869yQ2.D() > 0) {
                    m(sb, i2, c9869yQ2.J());
                }
                o(sb, i2);
                sb.append("}\n");
            }
        }
    }

    public final void n(StringBuilder sb, int i, C4696fv2 c4696fv2) {
        String str;
        if (c4696fv2 == null) {
            return;
        }
        o(sb, i);
        sb.append("filter {\n");
        if (c4696fv2.I()) {
            s(sb, i, "complement", Boolean.valueOf(c4696fv2.H()));
        }
        if (c4696fv2.K()) {
            s(sb, i, "param_name", this.a.D().e(c4696fv2.F()));
        }
        if (c4696fv2.L()) {
            int i2 = i + 1;
            C5610jC2 c5610jC2E = c4696fv2.E();
            if (c5610jC2E != null) {
                o(sb, i2);
                sb.append("string_filter {\n");
                if (c5610jC2E.J()) {
                    switch (c5610jC2E.K()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    s(sb, i2, "match_type", str);
                }
                if (c5610jC2E.I()) {
                    s(sb, i2, "expression", c5610jC2E.E());
                }
                if (c5610jC2E.H()) {
                    s(sb, i2, "case_sensitive", Boolean.valueOf(c5610jC2E.G()));
                }
                if (c5610jC2E.B() > 0) {
                    o(sb, i + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : c5610jC2E.F()) {
                        o(sb, i + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                o(sb, i2);
                sb.append("}\n");
            }
        }
        if (c4696fv2.J()) {
            t(sb, i + 1, "number_filter", c4696fv2.D());
        }
        o(sb, i);
        sb.append("}\n");
    }

    public final long y(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return z(str.getBytes(Charset.forName("UTF-8")));
    }

    public final long z(byte[] bArr) {
        AbstractC7506py0.l(bArr);
        this.a.N().d();
        MessageDigest messageDigestQ = Pf3.q();
        if (messageDigestQ != null) {
            return Pf3.s0(messageDigestQ.digest(bArr));
        }
        this.a.w().n().a("Failed to get MD5");
        return 0L;
    }
}
