package com.daaw;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.measurement.internal.zzq;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.daaw.uf3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8812uf3 implements InterfaceC5027h63 {
    public static volatile C8812uf3 F;
    public final Map A;
    public final Map B;
    public C5715jb3 C;
    public String D;
    public final QO2 a;
    public final PC2 b;
    public C1521Ls1 c;
    public C5618jE2 d;
    public C9372we3 e;
    public C1705Nm1 f;
    public final Af3 g;
    public C4031db3 h;
    public Bd3 i;
    public final He3 j;
    public XJ2 k;
    public final C9327wU2 l;
    public boolean n;
    public long o;
    public List p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public FileLock v;
    public FileChannel w;
    public List x;
    public List y;
    public long z;
    public boolean m = false;
    public final Mf3 E = new C4897gf3(this);

    public C8812uf3(C9656xf3 c9656xf3, C9327wU2 c9327wU2) {
        AbstractC7506py0.l(c9656xf3);
        this.l = C9327wU2.H(c9656xf3.a, null, null);
        this.z = -1L;
        this.j = new He3(this);
        Af3 af3 = new Af3(this);
        af3.f();
        this.g = af3;
        PC2 pc2 = new PC2(this);
        pc2.f();
        this.b = pc2;
        QO2 qo2 = new QO2(this);
        qo2.f();
        this.a = qo2;
        this.A = new HashMap();
        this.B = new HashMap();
        x().z(new Ke3(this, c9656xf3));
    }

    public static final void G(IN2 in2, int i, String str) {
        List listG = in2.G();
        for (int i2 = 0; i2 < listG.size(); i2++) {
            if ("_err".equals(((C9869yQ2) listG.get(i2)).H())) {
                return;
            }
        }
        WP2 wp2F = C9869yQ2.F();
        wp2F.z("_err");
        wp2F.y(i);
        C9869yQ2 c9869yQ2 = (C9869yQ2) wp2F.l();
        WP2 wp2F2 = C9869yQ2.F();
        wp2F2.z("_ev");
        wp2F2.A(str);
        C9869yQ2 c9869yQ22 = (C9869yQ2) wp2F2.l();
        in2.v(c9869yQ2);
        in2.v(c9869yQ22);
    }

    public static final void H(IN2 in2, String str) {
        List listG = in2.G();
        for (int i = 0; i < listG.size(); i++) {
            if (str.equals(((C9869yQ2) listG.get(i)).H())) {
                in2.x(i);
                return;
            }
        }
    }

    public static final boolean Q(zzq zzqVar) {
        return (TextUtils.isEmpty(zzqVar.C) && TextUtils.isEmpty(zzqVar.R)) ? false : true;
    }

    public static final Be3 R(Be3 be3) {
        if (be3 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (be3.g()) {
            return be3;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(be3.getClass())));
    }

    public static C8812uf3 f0(Context context) {
        AbstractC7506py0.l(context);
        AbstractC7506py0.l(context.getApplicationContext());
        if (F == null) {
            synchronized (C8812uf3.class) {
                try {
                    if (F == null) {
                        F = new C8812uf3((C9656xf3) AbstractC7506py0.l(new C9656xf3(context)), null);
                    }
                } finally {
                }
            }
        }
        return F;
    }

    public static /* bridge */ /* synthetic */ void k0(C8812uf3 c8812uf3, C9656xf3 c9656xf3) {
        c8812uf3.x().d();
        c8812uf3.k = new XJ2(c8812uf3);
        C1521Ls1 c1521Ls1 = new C1521Ls1(c8812uf3);
        c1521Ls1.f();
        c8812uf3.c = c1521Ls1;
        c8812uf3.U().z((InterfaceC1613Mp1) AbstractC7506py0.l(c8812uf3.a));
        Bd3 bd3 = new Bd3(c8812uf3);
        bd3.f();
        c8812uf3.i = bd3;
        C1705Nm1 c1705Nm1 = new C1705Nm1(c8812uf3);
        c1705Nm1.f();
        c8812uf3.f = c1705Nm1;
        C4031db3 c4031db3 = new C4031db3(c8812uf3);
        c4031db3.f();
        c8812uf3.h = c4031db3;
        C9372we3 c9372we3 = new C9372we3(c8812uf3);
        c9372we3.f();
        c8812uf3.e = c9372we3;
        c8812uf3.d = new C5618jE2(c8812uf3);
        if (c8812uf3.q != c8812uf3.r) {
            c8812uf3.w().n().c("Not all upload components initialized", Integer.valueOf(c8812uf3.q), Integer.valueOf(c8812uf3.r));
        }
        c8812uf3.m = true;
    }

    public final void A(String str, C3633c83 c3633c83) {
        x().d();
        c();
        this.A.put(str, c3633c83);
        C1521Ls1 c1521Ls1 = this.c;
        R(c1521Ls1);
        AbstractC7506py0.l(str);
        AbstractC7506py0.l(c3633c83);
        c1521Ls1.d();
        c1521Ls1.e();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c3633c83.i());
        try {
            if (c1521Ls1.P().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                c1521Ls1.a.w().n().b("Failed to insert/update consent setting (got -1). appId", C6675mz2.z(str));
            }
        } catch (SQLiteException e) {
            c1521Ls1.a.w().n().c("Error storing consent setting. appId, error", C6675mz2.z(str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(com.google.android.gms.measurement.internal.zzlk r18, com.google.android.gms.measurement.internal.zzq r19) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8812uf3.B(com.google.android.gms.measurement.internal.zzlk, com.google.android.gms.measurement.internal.zzq):void");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ba A[Catch: all -> 0x0034, TRY_ENTER, TryCatch #15 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:11:0x0038, B:13:0x003e, B:15:0x004e, B:17:0x0056, B:19:0x005c, B:21:0x0067, B:23:0x0077, B:25:0x0082, B:27:0x0095, B:29:0x00b4, B:31:0x00ba, B:32:0x00bd, B:34:0x00c9, B:35:0x00e0, B:37:0x00f1, B:39:0x00f7, B:43:0x010c, B:59:0x0131, B:61:0x0136, B:62:0x0139, B:63:0x013a, B:67:0x0162, B:71:0x016a, B:76:0x019c, B:143:0x02bd, B:145:0x02c3, B:147:0x02cf, B:148:0x02d3, B:150:0x02d9, B:152:0x02ed, B:156:0x02f6, B:158:0x02fc, B:164:0x0321, B:161:0x0311, B:163:0x031b, B:165:0x0324, B:167:0x033f, B:171:0x034e, B:173:0x0372, B:175:0x03aa, B:177:0x03af, B:179:0x03b7, B:180:0x03ba, B:182:0x03bf, B:183:0x03c2, B:185:0x03ce, B:186:0x03e4, B:187:0x03ea, B:189:0x03f9, B:191:0x040a, B:192:0x041f, B:194:0x042c, B:196:0x0441, B:198:0x044c, B:199:0x0455, B:195:0x043a, B:201:0x04a3, B:130:0x028d, B:205:0x04bd, B:206:0x04c0, B:142:0x02ba, B:207:0x04c1, B:212:0x04fd, B:232:0x052a, B:234:0x0530, B:236:0x053b, B:220:0x050b, B:240:0x0546, B:241:0x0549), top: B:259:0x0010, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c3 A[Catch: all -> 0x0034, TryCatch #15 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:11:0x0038, B:13:0x003e, B:15:0x004e, B:17:0x0056, B:19:0x005c, B:21:0x0067, B:23:0x0077, B:25:0x0082, B:27:0x0095, B:29:0x00b4, B:31:0x00ba, B:32:0x00bd, B:34:0x00c9, B:35:0x00e0, B:37:0x00f1, B:39:0x00f7, B:43:0x010c, B:59:0x0131, B:61:0x0136, B:62:0x0139, B:63:0x013a, B:67:0x0162, B:71:0x016a, B:76:0x019c, B:143:0x02bd, B:145:0x02c3, B:147:0x02cf, B:148:0x02d3, B:150:0x02d9, B:152:0x02ed, B:156:0x02f6, B:158:0x02fc, B:164:0x0321, B:161:0x0311, B:163:0x031b, B:165:0x0324, B:167:0x033f, B:171:0x034e, B:173:0x0372, B:175:0x03aa, B:177:0x03af, B:179:0x03b7, B:180:0x03ba, B:182:0x03bf, B:183:0x03c2, B:185:0x03ce, B:186:0x03e4, B:187:0x03ea, B:189:0x03f9, B:191:0x040a, B:192:0x041f, B:194:0x042c, B:196:0x0441, B:198:0x044c, B:199:0x0455, B:195:0x043a, B:201:0x04a3, B:130:0x028d, B:205:0x04bd, B:206:0x04c0, B:142:0x02ba, B:207:0x04c1, B:212:0x04fd, B:232:0x052a, B:234:0x0530, B:236:0x053b, B:220:0x050b, B:240:0x0546, B:241:0x0549), top: B:259:0x0010, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04bd A[Catch: all -> 0x0034, TryCatch #15 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:11:0x0038, B:13:0x003e, B:15:0x004e, B:17:0x0056, B:19:0x005c, B:21:0x0067, B:23:0x0077, B:25:0x0082, B:27:0x0095, B:29:0x00b4, B:31:0x00ba, B:32:0x00bd, B:34:0x00c9, B:35:0x00e0, B:37:0x00f1, B:39:0x00f7, B:43:0x010c, B:59:0x0131, B:61:0x0136, B:62:0x0139, B:63:0x013a, B:67:0x0162, B:71:0x016a, B:76:0x019c, B:143:0x02bd, B:145:0x02c3, B:147:0x02cf, B:148:0x02d3, B:150:0x02d9, B:152:0x02ed, B:156:0x02f6, B:158:0x02fc, B:164:0x0321, B:161:0x0311, B:163:0x031b, B:165:0x0324, B:167:0x033f, B:171:0x034e, B:173:0x0372, B:175:0x03aa, B:177:0x03af, B:179:0x03b7, B:180:0x03ba, B:182:0x03bf, B:183:0x03c2, B:185:0x03ce, B:186:0x03e4, B:187:0x03ea, B:189:0x03f9, B:191:0x040a, B:192:0x041f, B:194:0x042c, B:196:0x0441, B:198:0x044c, B:199:0x0455, B:195:0x043a, B:201:0x04a3, B:130:0x028d, B:205:0x04bd, B:206:0x04c0, B:142:0x02ba, B:207:0x04c1, B:212:0x04fd, B:232:0x052a, B:234:0x0530, B:236:0x053b, B:220:0x050b, B:240:0x0546, B:241:0x0549), top: B:259:0x0010, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0530 A[Catch: all -> 0x0034, TryCatch #15 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:11:0x0038, B:13:0x003e, B:15:0x004e, B:17:0x0056, B:19:0x005c, B:21:0x0067, B:23:0x0077, B:25:0x0082, B:27:0x0095, B:29:0x00b4, B:31:0x00ba, B:32:0x00bd, B:34:0x00c9, B:35:0x00e0, B:37:0x00f1, B:39:0x00f7, B:43:0x010c, B:59:0x0131, B:61:0x0136, B:62:0x0139, B:63:0x013a, B:67:0x0162, B:71:0x016a, B:76:0x019c, B:143:0x02bd, B:145:0x02c3, B:147:0x02cf, B:148:0x02d3, B:150:0x02d9, B:152:0x02ed, B:156:0x02f6, B:158:0x02fc, B:164:0x0321, B:161:0x0311, B:163:0x031b, B:165:0x0324, B:167:0x033f, B:171:0x034e, B:173:0x0372, B:175:0x03aa, B:177:0x03af, B:179:0x03b7, B:180:0x03ba, B:182:0x03bf, B:183:0x03c2, B:185:0x03ce, B:186:0x03e4, B:187:0x03ea, B:189:0x03f9, B:191:0x040a, B:192:0x041f, B:194:0x042c, B:196:0x0441, B:198:0x044c, B:199:0x0455, B:195:0x043a, B:201:0x04a3, B:130:0x028d, B:205:0x04bd, B:206:0x04c0, B:142:0x02ba, B:207:0x04c1, B:212:0x04fd, B:232:0x052a, B:234:0x0530, B:236:0x053b, B:220:0x050b, B:240:0x0546, B:241:0x0549), top: B:259:0x0010, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136 A[Catch: all -> 0x0034, TryCatch #15 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:11:0x0038, B:13:0x003e, B:15:0x004e, B:17:0x0056, B:19:0x005c, B:21:0x0067, B:23:0x0077, B:25:0x0082, B:27:0x0095, B:29:0x00b4, B:31:0x00ba, B:32:0x00bd, B:34:0x00c9, B:35:0x00e0, B:37:0x00f1, B:39:0x00f7, B:43:0x010c, B:59:0x0131, B:61:0x0136, B:62:0x0139, B:63:0x013a, B:67:0x0162, B:71:0x016a, B:76:0x019c, B:143:0x02bd, B:145:0x02c3, B:147:0x02cf, B:148:0x02d3, B:150:0x02d9, B:152:0x02ed, B:156:0x02f6, B:158:0x02fc, B:164:0x0321, B:161:0x0311, B:163:0x031b, B:165:0x0324, B:167:0x033f, B:171:0x034e, B:173:0x0372, B:175:0x03aa, B:177:0x03af, B:179:0x03b7, B:180:0x03ba, B:182:0x03bf, B:183:0x03c2, B:185:0x03ce, B:186:0x03e4, B:187:0x03ea, B:189:0x03f9, B:191:0x040a, B:192:0x041f, B:194:0x042c, B:196:0x0441, B:198:0x044c, B:199:0x0455, B:195:0x043a, B:201:0x04a3, B:130:0x028d, B:205:0x04bd, B:206:0x04c0, B:142:0x02ba, B:207:0x04c1, B:212:0x04fd, B:232:0x052a, B:234:0x0530, B:236:0x053b, B:220:0x050b, B:240:0x0546, B:241:0x0549), top: B:259:0x0010, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019a A[Catch: all -> 0x01a3, SQLiteException -> 0x01a8, TRY_LEAVE, TryCatch #3 {all -> 0x01a3, blocks: (B:73:0x0194, B:75:0x019a, B:82:0x01af, B:83:0x01b5, B:84:0x01b9, B:86:0x01c6, B:87:0x01db, B:89:0x01e1, B:90:0x01eb, B:92:0x01f1, B:98:0x01fe, B:100:0x0209, B:102:0x020f, B:103:0x0216, B:106:0x022d), top: B:249:0x0194 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01af A[Catch: all -> 0x01a3, SQLiteException -> 0x01a8, TRY_ENTER, TryCatch #3 {all -> 0x01a3, blocks: (B:73:0x0194, B:75:0x019a, B:82:0x01af, B:83:0x01b5, B:84:0x01b9, B:86:0x01c6, B:87:0x01db, B:89:0x01e1, B:90:0x01eb, B:92:0x01f1, B:98:0x01fe, B:100:0x0209, B:102:0x020f, B:103:0x0216, B:106:0x022d), top: B:249:0x0194 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C() {
        /*
            Method dump skipped, instruction units count: 1360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8812uf3.C():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:274:0x09c6, code lost:
    
        r13 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01da A[Catch: all -> 0x01ba, TRY_ENTER, TryCatch #5 {all -> 0x01ba, blocks: (B:38:0x0194, B:41:0x01a4, B:43:0x01ae, B:49:0x01bd, B:90:0x032e, B:101:0x036a, B:103:0x03a0, B:105:0x03a5, B:106:0x03bc, B:110:0x03cf, B:112:0x03e8, B:114:0x03ed, B:115:0x0404, B:120:0x042b, B:124:0x044c, B:125:0x0463, B:128:0x0474, B:131:0x0491, B:132:0x04a5, B:134:0x04af, B:136:0x04bc, B:138:0x04c2, B:139:0x04cb, B:140:0x04d9, B:142:0x04ee, B:151:0x051f, B:152:0x0534, B:154:0x055e, B:157:0x0576, B:160:0x05b7, B:162:0x05e5, B:164:0x0622, B:165:0x0627, B:167:0x062f, B:168:0x0634, B:170:0x063c, B:171:0x0641, B:173:0x064c, B:175:0x0659, B:177:0x0667, B:178:0x066c, B:180:0x0675, B:181:0x0679, B:183:0x0686, B:184:0x068b, B:186:0x06b4, B:188:0x06bc, B:189:0x06c1, B:191:0x06c7, B:192:0x06ca, B:194:0x06ee, B:197:0x06f7, B:200:0x0700, B:201:0x071a, B:203:0x0720, B:205:0x0736, B:207:0x0742, B:209:0x074f, B:214:0x076c, B:215:0x077c, B:220:0x0787, B:221:0x078a, B:223:0x07a8, B:225:0x07ac, B:227:0x07be, B:229:0x07c2, B:231:0x07cd, B:232:0x07d6, B:234:0x081d, B:235:0x0822, B:237:0x082a, B:239:0x0834, B:240:0x0837, B:242:0x0844, B:244:0x0864, B:245:0x0871, B:246:0x08a7, B:248:0x08af, B:250:0x08b9, B:251:0x08c6, B:253:0x08d0, B:254:0x08dd, B:255:0x08e9, B:257:0x08ef, B:259:0x0929, B:261:0x0939, B:263:0x0943, B:265:0x0956, B:267:0x095c, B:268:0x099f, B:269:0x09aa, B:270:0x09b6, B:272:0x09bc, B:281:0x0a09, B:282:0x0a57, B:284:0x0a66, B:298:0x0ac9, B:289:0x0a80, B:290:0x0a83, B:275:0x09c8, B:277:0x09f4, B:295:0x0a9c, B:296:0x0ab3, B:297:0x0ab4, B:195:0x06f1, B:161:0x05d5, B:148:0x0506, B:94:0x0346, B:95:0x034d, B:97:0x0353, B:99:0x035f, B:54:0x01ce, B:57:0x01da, B:59:0x01f1, B:64:0x020a, B:71:0x0248, B:73:0x024e, B:75:0x025c, B:77:0x026d, B:80:0x0276, B:87:0x02f5, B:89:0x0300, B:81:0x029c, B:82:0x02b6, B:86:0x02dc, B:85:0x02c9, B:67:0x0218, B:70:0x023e), top: B:314:0x0194, inners: #0, #1, #2, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023e A[Catch: all -> 0x01ba, TRY_ENTER, TryCatch #5 {all -> 0x01ba, blocks: (B:38:0x0194, B:41:0x01a4, B:43:0x01ae, B:49:0x01bd, B:90:0x032e, B:101:0x036a, B:103:0x03a0, B:105:0x03a5, B:106:0x03bc, B:110:0x03cf, B:112:0x03e8, B:114:0x03ed, B:115:0x0404, B:120:0x042b, B:124:0x044c, B:125:0x0463, B:128:0x0474, B:131:0x0491, B:132:0x04a5, B:134:0x04af, B:136:0x04bc, B:138:0x04c2, B:139:0x04cb, B:140:0x04d9, B:142:0x04ee, B:151:0x051f, B:152:0x0534, B:154:0x055e, B:157:0x0576, B:160:0x05b7, B:162:0x05e5, B:164:0x0622, B:165:0x0627, B:167:0x062f, B:168:0x0634, B:170:0x063c, B:171:0x0641, B:173:0x064c, B:175:0x0659, B:177:0x0667, B:178:0x066c, B:180:0x0675, B:181:0x0679, B:183:0x0686, B:184:0x068b, B:186:0x06b4, B:188:0x06bc, B:189:0x06c1, B:191:0x06c7, B:192:0x06ca, B:194:0x06ee, B:197:0x06f7, B:200:0x0700, B:201:0x071a, B:203:0x0720, B:205:0x0736, B:207:0x0742, B:209:0x074f, B:214:0x076c, B:215:0x077c, B:220:0x0787, B:221:0x078a, B:223:0x07a8, B:225:0x07ac, B:227:0x07be, B:229:0x07c2, B:231:0x07cd, B:232:0x07d6, B:234:0x081d, B:235:0x0822, B:237:0x082a, B:239:0x0834, B:240:0x0837, B:242:0x0844, B:244:0x0864, B:245:0x0871, B:246:0x08a7, B:248:0x08af, B:250:0x08b9, B:251:0x08c6, B:253:0x08d0, B:254:0x08dd, B:255:0x08e9, B:257:0x08ef, B:259:0x0929, B:261:0x0939, B:263:0x0943, B:265:0x0956, B:267:0x095c, B:268:0x099f, B:269:0x09aa, B:270:0x09b6, B:272:0x09bc, B:281:0x0a09, B:282:0x0a57, B:284:0x0a66, B:298:0x0ac9, B:289:0x0a80, B:290:0x0a83, B:275:0x09c8, B:277:0x09f4, B:295:0x0a9c, B:296:0x0ab3, B:297:0x0ab4, B:195:0x06f1, B:161:0x05d5, B:148:0x0506, B:94:0x0346, B:95:0x034d, B:97:0x0353, B:99:0x035f, B:54:0x01ce, B:57:0x01da, B:59:0x01f1, B:64:0x020a, B:71:0x0248, B:73:0x024e, B:75:0x025c, B:77:0x026d, B:80:0x0276, B:87:0x02f5, B:89:0x0300, B:81:0x029c, B:82:0x02b6, B:86:0x02dc, B:85:0x02c9, B:67:0x0218, B:70:0x023e), top: B:314:0x0194, inners: #0, #1, #2, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024e A[Catch: all -> 0x01ba, TryCatch #5 {all -> 0x01ba, blocks: (B:38:0x0194, B:41:0x01a4, B:43:0x01ae, B:49:0x01bd, B:90:0x032e, B:101:0x036a, B:103:0x03a0, B:105:0x03a5, B:106:0x03bc, B:110:0x03cf, B:112:0x03e8, B:114:0x03ed, B:115:0x0404, B:120:0x042b, B:124:0x044c, B:125:0x0463, B:128:0x0474, B:131:0x0491, B:132:0x04a5, B:134:0x04af, B:136:0x04bc, B:138:0x04c2, B:139:0x04cb, B:140:0x04d9, B:142:0x04ee, B:151:0x051f, B:152:0x0534, B:154:0x055e, B:157:0x0576, B:160:0x05b7, B:162:0x05e5, B:164:0x0622, B:165:0x0627, B:167:0x062f, B:168:0x0634, B:170:0x063c, B:171:0x0641, B:173:0x064c, B:175:0x0659, B:177:0x0667, B:178:0x066c, B:180:0x0675, B:181:0x0679, B:183:0x0686, B:184:0x068b, B:186:0x06b4, B:188:0x06bc, B:189:0x06c1, B:191:0x06c7, B:192:0x06ca, B:194:0x06ee, B:197:0x06f7, B:200:0x0700, B:201:0x071a, B:203:0x0720, B:205:0x0736, B:207:0x0742, B:209:0x074f, B:214:0x076c, B:215:0x077c, B:220:0x0787, B:221:0x078a, B:223:0x07a8, B:225:0x07ac, B:227:0x07be, B:229:0x07c2, B:231:0x07cd, B:232:0x07d6, B:234:0x081d, B:235:0x0822, B:237:0x082a, B:239:0x0834, B:240:0x0837, B:242:0x0844, B:244:0x0864, B:245:0x0871, B:246:0x08a7, B:248:0x08af, B:250:0x08b9, B:251:0x08c6, B:253:0x08d0, B:254:0x08dd, B:255:0x08e9, B:257:0x08ef, B:259:0x0929, B:261:0x0939, B:263:0x0943, B:265:0x0956, B:267:0x095c, B:268:0x099f, B:269:0x09aa, B:270:0x09b6, B:272:0x09bc, B:281:0x0a09, B:282:0x0a57, B:284:0x0a66, B:298:0x0ac9, B:289:0x0a80, B:290:0x0a83, B:275:0x09c8, B:277:0x09f4, B:295:0x0a9c, B:296:0x0ab3, B:297:0x0ab4, B:195:0x06f1, B:161:0x05d5, B:148:0x0506, B:94:0x0346, B:95:0x034d, B:97:0x0353, B:99:0x035f, B:54:0x01ce, B:57:0x01da, B:59:0x01f1, B:64:0x020a, B:71:0x0248, B:73:0x024e, B:75:0x025c, B:77:0x026d, B:80:0x0276, B:87:0x02f5, B:89:0x0300, B:81:0x029c, B:82:0x02b6, B:86:0x02dc, B:85:0x02c9, B:67:0x0218, B:70:0x023e), top: B:314:0x0194, inners: #0, #1, #2, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(com.google.android.gms.measurement.internal.zzau r41, com.google.android.gms.measurement.internal.zzq r42) {
        /*
            Method dump skipped, instruction units count: 2825
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8812uf3.D(com.google.android.gms.measurement.internal.zzau, com.google.android.gms.measurement.internal.zzq):void");
    }

    public final boolean E() {
        x().d();
        FileLock fileLock = this.v;
        if (fileLock != null && fileLock.isValid()) {
            w().s().a("Storage concurrent access okay");
            return true;
        }
        this.c.a.z();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.l.v().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.w = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.v = fileLockTryLock;
            if (fileLockTryLock != null) {
                w().s().a("Storage concurrent access okay");
                return true;
            }
            w().n().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            w().n().b("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            w().n().b("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            w().t().b("Storage lock already acquired", e3);
            return false;
        }
    }

    public final long F() {
        long jA = p().a();
        Bd3 bd3 = this.i;
        bd3.e();
        bd3.d();
        long jA2 = bd3.i.a();
        if (jA2 == 0) {
            jA2 = ((long) bd3.a.N().r().nextInt(86400000)) + 1;
            bd3.i.b(jA2);
        }
        return ((((jA + jA2) / 1000) / 60) / 60) / 24;
    }

    public final zzq I(String str) {
        C1521Ls1 c1521Ls1 = this.c;
        R(c1521Ls1);
        C8110s73 c8110s73R = c1521Ls1.R(str);
        if (c8110s73R == null || TextUtils.isEmpty(c8110s73R.o0())) {
            w().m().b("No app data available; dropping", str);
            return null;
        }
        Boolean boolJ = J(c8110s73R);
        if (boolJ != null && !boolJ.booleanValue()) {
            w().n().b("App version does not match; dropping. appId", C6675mz2.z(str));
            return null;
        }
        String strA = c8110s73R.a();
        String strO0 = c8110s73R.o0();
        long jR = c8110s73R.R();
        String strN0 = c8110s73R.n0();
        long jC0 = c8110s73R.c0();
        long jZ = c8110s73R.Z();
        boolean zO = c8110s73R.O();
        String strP0 = c8110s73R.p0();
        c8110s73R.A();
        return new zzq(str, strA, strO0, jR, strN0, jC0, jZ, (String) null, zO, false, strP0, 0L, 0L, 0, c8110s73R.N(), false, c8110s73R.j0(), c8110s73R.i0(), c8110s73R.a0(), c8110s73R.e(), (String) null, c0(str).i(), "", (String) null, c8110s73R.Q(), c8110s73R.h0());
    }

    public final Boolean J(C8110s73 c8110s73) {
        try {
            if (c8110s73.R() != -2147483648L) {
                if (c8110s73.R() == C6878nj1.a(this.l.v()).f(c8110s73.l0(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C6878nj1.a(this.l.v()).f(c8110s73.l0(), 0).versionName;
                String strO0 = c8110s73.o0();
                if (strO0 != null && strO0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final void K() {
        x().d();
        if (this.s || this.t || this.u) {
            w().s().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.s), Boolean.valueOf(this.t), Boolean.valueOf(this.u));
            return;
        }
        w().s().a("Stopping uploading service(s)");
        List list = this.p;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) AbstractC7506py0.l(this.p)).clear();
    }

    public final void L(QT2 qt2, long j, boolean z) {
        C1521Ls1 c1521Ls1 = this.c;
        R(c1521Ls1);
        String str = true != z ? "_lte" : "_se";
        If3 if3X = c1521Ls1.X(qt2.m0(), str);
        If3 if3 = (if3X == null || if3X.e == null) ? new If3(qt2.m0(), "auto", str, p().a(), Long.valueOf(j)) : new If3(qt2.m0(), "auto", str, p().a(), Long.valueOf(((Long) if3X.e).longValue() + j));
        ZY2 zy2E = DZ2.E();
        zy2E.v(str);
        zy2E.w(p().a());
        zy2E.u(((Long) if3.e).longValue());
        DZ2 dz2 = (DZ2) zy2E.l();
        int iU = Af3.u(qt2, str);
        if (iU >= 0) {
            qt2.j0(iU, dz2);
        } else {
            qt2.C0(dz2);
        }
        if (j > 0) {
            C1521Ls1 c1521Ls12 = this.c;
            R(c1521Ls12);
            c1521Ls12.u(if3);
            w().s().c("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", if3.e);
        }
    }

    public final void M() {
        long jMax;
        long jMax2;
        x().d();
        c();
        if (this.o > 0) {
            long jAbs = 3600000 - Math.abs(p().b() - this.o);
            if (jAbs > 0) {
                w().s().b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                Y().c();
                C9372we3 c9372we3 = this.e;
                R(c9372we3);
                c9372we3.i();
                return;
            }
            this.o = 0L;
        }
        if (!this.l.n() || !O()) {
            w().s().a("Nothing to upload or uploading impossible");
            Y().c();
            C9372we3 c9372we32 = this.e;
            R(c9372we32);
            c9372we32.i();
            return;
        }
        long jA = p().a();
        U();
        long jMax3 = Math.max(0L, ((Long) AbstractC1311Jr2.C.a(null)).longValue());
        C1521Ls1 c1521Ls1 = this.c;
        R(c1521Ls1);
        boolean z = true;
        if (!c1521Ls1.q()) {
            C1521Ls1 c1521Ls12 = this.c;
            R(c1521Ls12);
            if (!c1521Ls12.o()) {
                z = false;
            }
        }
        if (z) {
            String strR = U().r();
            if (TextUtils.isEmpty(strR) || ".none.".equals(strR)) {
                U();
                jMax = Math.max(0L, ((Long) AbstractC1311Jr2.w.a(null)).longValue());
            } else {
                U();
                jMax = Math.max(0L, ((Long) AbstractC1311Jr2.x.a(null)).longValue());
            }
        } else {
            U();
            jMax = Math.max(0L, ((Long) AbstractC1311Jr2.v.a(null)).longValue());
        }
        long jA2 = this.i.g.a();
        long jA3 = this.i.h.a();
        C1521Ls1 c1521Ls13 = this.c;
        R(c1521Ls13);
        long j = 0;
        long jM = c1521Ls13.M();
        C1521Ls1 c1521Ls14 = this.c;
        R(c1521Ls14);
        boolean z2 = z;
        long jMax4 = Math.max(jM, c1521Ls14.N());
        if (jMax4 == 0) {
            jMax2 = 0;
        } else {
            long jAbs2 = jA - Math.abs(jMax4 - jA);
            long jAbs3 = jA - Math.abs(jA2 - jA);
            long jAbs4 = jA - Math.abs(jA3 - jA);
            jMax2 = jMax3 + jAbs2;
            long jMax5 = Math.max(jAbs3, jAbs4);
            if (z2 && jMax5 > 0) {
                jMax2 = Math.min(jAbs2, jMax5) + jMax;
            }
            Af3 af3 = this.g;
            R(af3);
            if (!af3.O(jMax5, jMax)) {
                jMax2 = jMax5 + jMax;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i = 0;
                while (true) {
                    U();
                    if (i >= Math.min(20, Math.max(0, ((Integer) AbstractC1311Jr2.E.a(null)).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    U();
                    jMax2 += Math.max(j, ((Long) AbstractC1311Jr2.D.a(null)).longValue()) * (1 << i);
                    if (jMax2 > jAbs4) {
                        break;
                    }
                    i++;
                    j = 0;
                }
            }
            j = 0;
        }
        if (jMax2 == j) {
            w().s().a("Next upload time is 0");
            Y().c();
            C9372we3 c9372we33 = this.e;
            R(c9372we33);
            c9372we33.i();
            return;
        }
        PC2 pc2 = this.b;
        R(pc2);
        if (!pc2.i()) {
            w().s().a("No network");
            Y().b();
            C9372we3 c9372we34 = this.e;
            R(c9372we34);
            c9372we34.i();
            return;
        }
        long jA4 = this.i.f.a();
        U();
        long jMax6 = Math.max(0L, ((Long) AbstractC1311Jr2.t.a(null)).longValue());
        Af3 af32 = this.g;
        R(af32);
        if (!af32.O(jA4, jMax6)) {
            jMax2 = Math.max(jMax2, jA4 + jMax6);
        }
        Y().c();
        long jA5 = jMax2 - p().a();
        if (jA5 <= 0) {
            U();
            jA5 = Math.max(0L, ((Long) AbstractC1311Jr2.y.a(null)).longValue());
            this.i.g.b(p().a());
        }
        w().s().b("Upload scheduled in approximately ms", Long.valueOf(jA5));
        C9372we3 c9372we35 = this.e;
        R(c9372we35);
        c9372we35.j(jA5);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0396 A[Catch: all -> 0x00e8, TryCatch #2 {all -> 0x00e8, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x007a, B:17:0x00b0, B:20:0x00c2, B:22:0x00cc, B:161:0x0511, B:27:0x00f6, B:29:0x0104, B:32:0x0124, B:34:0x012a, B:36:0x013c, B:38:0x014a, B:40:0x015a, B:41:0x0167, B:42:0x016c, B:45:0x0185, B:54:0x01ba, B:57:0x01c4, B:59:0x01d2, B:64:0x0224, B:60:0x01f4, B:62:0x0206, B:68:0x0235, B:70:0x0261, B:71:0x028b, B:73:0x02c3, B:75:0x02c9, B:78:0x02d5, B:80:0x030b, B:81:0x0326, B:83:0x032c, B:85:0x033c, B:90:0x0354, B:86:0x0344, B:94:0x035d, B:97:0x0365, B:98:0x037d, B:100:0x0396, B:101:0x03a2, B:104:0x03ae, B:110:0x03d1, B:107:0x03c0, B:133:0x0455, B:135:0x0461, B:138:0x0474, B:140:0x0486, B:142:0x0492, B:160:0x04ff, B:148:0x04aa, B:150:0x04b8, B:153:0x04cd, B:155:0x04df, B:157:0x04eb, B:114:0x03db, B:116:0x03e7, B:118:0x03f3, B:131:0x0439, B:123:0x0411, B:126:0x0423, B:128:0x0429, B:130:0x0433, B:164:0x0523, B:166:0x0531, B:168:0x053c, B:179:0x056e, B:169:0x0544, B:171:0x054f, B:173:0x0555, B:176:0x0561, B:178:0x0569, B:180:0x0571, B:181:0x057d, B:184:0x0585, B:186:0x0597, B:187:0x05a3, B:189:0x05ab, B:193:0x05d0, B:195:0x05f5, B:197:0x0606, B:199:0x060c, B:201:0x0618, B:202:0x0647, B:204:0x064d, B:206:0x065b, B:207:0x065f, B:208:0x0662, B:209:0x0665, B:210:0x0673, B:212:0x0679, B:214:0x0689, B:215:0x0690, B:217:0x069c, B:218:0x06a3, B:219:0x06a6, B:221:0x06e4, B:222:0x06f7, B:224:0x06fd, B:227:0x0718, B:229:0x0733, B:231:0x074a, B:233:0x074f, B:235:0x0753, B:237:0x0757, B:239:0x0761, B:240:0x076b, B:242:0x076f, B:244:0x0775, B:245:0x0783, B:246:0x078c, B:313:0x09c0, B:248:0x0799, B:250:0x07b0, B:255:0x07ca, B:257:0x07ef, B:258:0x07f7, B:260:0x07fd, B:262:0x080f, B:268:0x0825, B:270:0x083a, B:271:0x085d, B:273:0x0869, B:275:0x087e, B:276:0x08ba, B:282:0x08d6, B:284:0x08e1, B:286:0x08e5, B:288:0x08e9, B:290:0x08ed, B:291:0x08f9, B:292:0x08fe, B:294:0x0904, B:296:0x091d, B:297:0x0922, B:312:0x09bd, B:298:0x0939, B:300:0x093e, B:304:0x0965, B:306:0x098d, B:307:0x0994, B:311:0x09b0, B:301:0x094b, B:253:0x07b6, B:314:0x09c9, B:316:0x09d6, B:317:0x09dc, B:318:0x09e4, B:320:0x09ea, B:322:0x0a01, B:324:0x0a12, B:344:0x0a82, B:346:0x0a88, B:348:0x0aa0, B:351:0x0aa7, B:356:0x0ad6, B:358:0x0b19, B:361:0x0b4e, B:362:0x0b52, B:363:0x0b5d, B:365:0x0ba0, B:366:0x0bad, B:368:0x0bbc, B:371:0x0bd5, B:373:0x0bee, B:360:0x0b2b, B:352:0x0aaf, B:354:0x0abb, B:355:0x0abf, B:374:0x0c05, B:375:0x0c1d, B:378:0x0c25, B:379:0x0c2a, B:380:0x0c3a, B:382:0x0c54, B:383:0x0c6f, B:384:0x0c78, B:388:0x0c96, B:387:0x0c83, B:325:0x0a2a, B:327:0x0a30, B:329:0x0a38, B:331:0x0a3f, B:337:0x0a4d, B:339:0x0a54, B:341:0x0a73, B:343:0x0a7a, B:342:0x0a77, B:338:0x0a51, B:330:0x0a3c, B:190:0x05b0, B:192:0x05b6, B:391:0x0ca9), top: B:400:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0461 A[Catch: all -> 0x00e8, TryCatch #2 {all -> 0x00e8, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x007a, B:17:0x00b0, B:20:0x00c2, B:22:0x00cc, B:161:0x0511, B:27:0x00f6, B:29:0x0104, B:32:0x0124, B:34:0x012a, B:36:0x013c, B:38:0x014a, B:40:0x015a, B:41:0x0167, B:42:0x016c, B:45:0x0185, B:54:0x01ba, B:57:0x01c4, B:59:0x01d2, B:64:0x0224, B:60:0x01f4, B:62:0x0206, B:68:0x0235, B:70:0x0261, B:71:0x028b, B:73:0x02c3, B:75:0x02c9, B:78:0x02d5, B:80:0x030b, B:81:0x0326, B:83:0x032c, B:85:0x033c, B:90:0x0354, B:86:0x0344, B:94:0x035d, B:97:0x0365, B:98:0x037d, B:100:0x0396, B:101:0x03a2, B:104:0x03ae, B:110:0x03d1, B:107:0x03c0, B:133:0x0455, B:135:0x0461, B:138:0x0474, B:140:0x0486, B:142:0x0492, B:160:0x04ff, B:148:0x04aa, B:150:0x04b8, B:153:0x04cd, B:155:0x04df, B:157:0x04eb, B:114:0x03db, B:116:0x03e7, B:118:0x03f3, B:131:0x0439, B:123:0x0411, B:126:0x0423, B:128:0x0429, B:130:0x0433, B:164:0x0523, B:166:0x0531, B:168:0x053c, B:179:0x056e, B:169:0x0544, B:171:0x054f, B:173:0x0555, B:176:0x0561, B:178:0x0569, B:180:0x0571, B:181:0x057d, B:184:0x0585, B:186:0x0597, B:187:0x05a3, B:189:0x05ab, B:193:0x05d0, B:195:0x05f5, B:197:0x0606, B:199:0x060c, B:201:0x0618, B:202:0x0647, B:204:0x064d, B:206:0x065b, B:207:0x065f, B:208:0x0662, B:209:0x0665, B:210:0x0673, B:212:0x0679, B:214:0x0689, B:215:0x0690, B:217:0x069c, B:218:0x06a3, B:219:0x06a6, B:221:0x06e4, B:222:0x06f7, B:224:0x06fd, B:227:0x0718, B:229:0x0733, B:231:0x074a, B:233:0x074f, B:235:0x0753, B:237:0x0757, B:239:0x0761, B:240:0x076b, B:242:0x076f, B:244:0x0775, B:245:0x0783, B:246:0x078c, B:313:0x09c0, B:248:0x0799, B:250:0x07b0, B:255:0x07ca, B:257:0x07ef, B:258:0x07f7, B:260:0x07fd, B:262:0x080f, B:268:0x0825, B:270:0x083a, B:271:0x085d, B:273:0x0869, B:275:0x087e, B:276:0x08ba, B:282:0x08d6, B:284:0x08e1, B:286:0x08e5, B:288:0x08e9, B:290:0x08ed, B:291:0x08f9, B:292:0x08fe, B:294:0x0904, B:296:0x091d, B:297:0x0922, B:312:0x09bd, B:298:0x0939, B:300:0x093e, B:304:0x0965, B:306:0x098d, B:307:0x0994, B:311:0x09b0, B:301:0x094b, B:253:0x07b6, B:314:0x09c9, B:316:0x09d6, B:317:0x09dc, B:318:0x09e4, B:320:0x09ea, B:322:0x0a01, B:324:0x0a12, B:344:0x0a82, B:346:0x0a88, B:348:0x0aa0, B:351:0x0aa7, B:356:0x0ad6, B:358:0x0b19, B:361:0x0b4e, B:362:0x0b52, B:363:0x0b5d, B:365:0x0ba0, B:366:0x0bad, B:368:0x0bbc, B:371:0x0bd5, B:373:0x0bee, B:360:0x0b2b, B:352:0x0aaf, B:354:0x0abb, B:355:0x0abf, B:374:0x0c05, B:375:0x0c1d, B:378:0x0c25, B:379:0x0c2a, B:380:0x0c3a, B:382:0x0c54, B:383:0x0c6f, B:384:0x0c78, B:388:0x0c96, B:387:0x0c83, B:325:0x0a2a, B:327:0x0a30, B:329:0x0a38, B:331:0x0a3f, B:337:0x0a4d, B:339:0x0a54, B:341:0x0a73, B:343:0x0a7a, B:342:0x0a77, B:338:0x0a51, B:330:0x0a3c, B:190:0x05b0, B:192:0x05b6, B:391:0x0ca9), top: B:400:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04aa A[Catch: all -> 0x00e8, TryCatch #2 {all -> 0x00e8, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x007a, B:17:0x00b0, B:20:0x00c2, B:22:0x00cc, B:161:0x0511, B:27:0x00f6, B:29:0x0104, B:32:0x0124, B:34:0x012a, B:36:0x013c, B:38:0x014a, B:40:0x015a, B:41:0x0167, B:42:0x016c, B:45:0x0185, B:54:0x01ba, B:57:0x01c4, B:59:0x01d2, B:64:0x0224, B:60:0x01f4, B:62:0x0206, B:68:0x0235, B:70:0x0261, B:71:0x028b, B:73:0x02c3, B:75:0x02c9, B:78:0x02d5, B:80:0x030b, B:81:0x0326, B:83:0x032c, B:85:0x033c, B:90:0x0354, B:86:0x0344, B:94:0x035d, B:97:0x0365, B:98:0x037d, B:100:0x0396, B:101:0x03a2, B:104:0x03ae, B:110:0x03d1, B:107:0x03c0, B:133:0x0455, B:135:0x0461, B:138:0x0474, B:140:0x0486, B:142:0x0492, B:160:0x04ff, B:148:0x04aa, B:150:0x04b8, B:153:0x04cd, B:155:0x04df, B:157:0x04eb, B:114:0x03db, B:116:0x03e7, B:118:0x03f3, B:131:0x0439, B:123:0x0411, B:126:0x0423, B:128:0x0429, B:130:0x0433, B:164:0x0523, B:166:0x0531, B:168:0x053c, B:179:0x056e, B:169:0x0544, B:171:0x054f, B:173:0x0555, B:176:0x0561, B:178:0x0569, B:180:0x0571, B:181:0x057d, B:184:0x0585, B:186:0x0597, B:187:0x05a3, B:189:0x05ab, B:193:0x05d0, B:195:0x05f5, B:197:0x0606, B:199:0x060c, B:201:0x0618, B:202:0x0647, B:204:0x064d, B:206:0x065b, B:207:0x065f, B:208:0x0662, B:209:0x0665, B:210:0x0673, B:212:0x0679, B:214:0x0689, B:215:0x0690, B:217:0x069c, B:218:0x06a3, B:219:0x06a6, B:221:0x06e4, B:222:0x06f7, B:224:0x06fd, B:227:0x0718, B:229:0x0733, B:231:0x074a, B:233:0x074f, B:235:0x0753, B:237:0x0757, B:239:0x0761, B:240:0x076b, B:242:0x076f, B:244:0x0775, B:245:0x0783, B:246:0x078c, B:313:0x09c0, B:248:0x0799, B:250:0x07b0, B:255:0x07ca, B:257:0x07ef, B:258:0x07f7, B:260:0x07fd, B:262:0x080f, B:268:0x0825, B:270:0x083a, B:271:0x085d, B:273:0x0869, B:275:0x087e, B:276:0x08ba, B:282:0x08d6, B:284:0x08e1, B:286:0x08e5, B:288:0x08e9, B:290:0x08ed, B:291:0x08f9, B:292:0x08fe, B:294:0x0904, B:296:0x091d, B:297:0x0922, B:312:0x09bd, B:298:0x0939, B:300:0x093e, B:304:0x0965, B:306:0x098d, B:307:0x0994, B:311:0x09b0, B:301:0x094b, B:253:0x07b6, B:314:0x09c9, B:316:0x09d6, B:317:0x09dc, B:318:0x09e4, B:320:0x09ea, B:322:0x0a01, B:324:0x0a12, B:344:0x0a82, B:346:0x0a88, B:348:0x0aa0, B:351:0x0aa7, B:356:0x0ad6, B:358:0x0b19, B:361:0x0b4e, B:362:0x0b52, B:363:0x0b5d, B:365:0x0ba0, B:366:0x0bad, B:368:0x0bbc, B:371:0x0bd5, B:373:0x0bee, B:360:0x0b2b, B:352:0x0aaf, B:354:0x0abb, B:355:0x0abf, B:374:0x0c05, B:375:0x0c1d, B:378:0x0c25, B:379:0x0c2a, B:380:0x0c3a, B:382:0x0c54, B:383:0x0c6f, B:384:0x0c78, B:388:0x0c96, B:387:0x0c83, B:325:0x0a2a, B:327:0x0a30, B:329:0x0a38, B:331:0x0a3f, B:337:0x0a4d, B:339:0x0a54, B:341:0x0a73, B:343:0x0a7a, B:342:0x0a77, B:338:0x0a51, B:330:0x0a3c, B:190:0x05b0, B:192:0x05b6, B:391:0x0ca9), top: B:400:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0544 A[Catch: all -> 0x00e8, TryCatch #2 {all -> 0x00e8, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x007a, B:17:0x00b0, B:20:0x00c2, B:22:0x00cc, B:161:0x0511, B:27:0x00f6, B:29:0x0104, B:32:0x0124, B:34:0x012a, B:36:0x013c, B:38:0x014a, B:40:0x015a, B:41:0x0167, B:42:0x016c, B:45:0x0185, B:54:0x01ba, B:57:0x01c4, B:59:0x01d2, B:64:0x0224, B:60:0x01f4, B:62:0x0206, B:68:0x0235, B:70:0x0261, B:71:0x028b, B:73:0x02c3, B:75:0x02c9, B:78:0x02d5, B:80:0x030b, B:81:0x0326, B:83:0x032c, B:85:0x033c, B:90:0x0354, B:86:0x0344, B:94:0x035d, B:97:0x0365, B:98:0x037d, B:100:0x0396, B:101:0x03a2, B:104:0x03ae, B:110:0x03d1, B:107:0x03c0, B:133:0x0455, B:135:0x0461, B:138:0x0474, B:140:0x0486, B:142:0x0492, B:160:0x04ff, B:148:0x04aa, B:150:0x04b8, B:153:0x04cd, B:155:0x04df, B:157:0x04eb, B:114:0x03db, B:116:0x03e7, B:118:0x03f3, B:131:0x0439, B:123:0x0411, B:126:0x0423, B:128:0x0429, B:130:0x0433, B:164:0x0523, B:166:0x0531, B:168:0x053c, B:179:0x056e, B:169:0x0544, B:171:0x054f, B:173:0x0555, B:176:0x0561, B:178:0x0569, B:180:0x0571, B:181:0x057d, B:184:0x0585, B:186:0x0597, B:187:0x05a3, B:189:0x05ab, B:193:0x05d0, B:195:0x05f5, B:197:0x0606, B:199:0x060c, B:201:0x0618, B:202:0x0647, B:204:0x064d, B:206:0x065b, B:207:0x065f, B:208:0x0662, B:209:0x0665, B:210:0x0673, B:212:0x0679, B:214:0x0689, B:215:0x0690, B:217:0x069c, B:218:0x06a3, B:219:0x06a6, B:221:0x06e4, B:222:0x06f7, B:224:0x06fd, B:227:0x0718, B:229:0x0733, B:231:0x074a, B:233:0x074f, B:235:0x0753, B:237:0x0757, B:239:0x0761, B:240:0x076b, B:242:0x076f, B:244:0x0775, B:245:0x0783, B:246:0x078c, B:313:0x09c0, B:248:0x0799, B:250:0x07b0, B:255:0x07ca, B:257:0x07ef, B:258:0x07f7, B:260:0x07fd, B:262:0x080f, B:268:0x0825, B:270:0x083a, B:271:0x085d, B:273:0x0869, B:275:0x087e, B:276:0x08ba, B:282:0x08d6, B:284:0x08e1, B:286:0x08e5, B:288:0x08e9, B:290:0x08ed, B:291:0x08f9, B:292:0x08fe, B:294:0x0904, B:296:0x091d, B:297:0x0922, B:312:0x09bd, B:298:0x0939, B:300:0x093e, B:304:0x0965, B:306:0x098d, B:307:0x0994, B:311:0x09b0, B:301:0x094b, B:253:0x07b6, B:314:0x09c9, B:316:0x09d6, B:317:0x09dc, B:318:0x09e4, B:320:0x09ea, B:322:0x0a01, B:324:0x0a12, B:344:0x0a82, B:346:0x0a88, B:348:0x0aa0, B:351:0x0aa7, B:356:0x0ad6, B:358:0x0b19, B:361:0x0b4e, B:362:0x0b52, B:363:0x0b5d, B:365:0x0ba0, B:366:0x0bad, B:368:0x0bbc, B:371:0x0bd5, B:373:0x0bee, B:360:0x0b2b, B:352:0x0aaf, B:354:0x0abb, B:355:0x0abf, B:374:0x0c05, B:375:0x0c1d, B:378:0x0c25, B:379:0x0c2a, B:380:0x0c3a, B:382:0x0c54, B:383:0x0c6f, B:384:0x0c78, B:388:0x0c96, B:387:0x0c83, B:325:0x0a2a, B:327:0x0a30, B:329:0x0a38, B:331:0x0a3f, B:337:0x0a4d, B:339:0x0a54, B:341:0x0a73, B:343:0x0a7a, B:342:0x0a77, B:338:0x0a51, B:330:0x0a3c, B:190:0x05b0, B:192:0x05b6, B:391:0x0ca9), top: B:400:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07ef A[Catch: all -> 0x00e8, TryCatch #2 {all -> 0x00e8, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x007a, B:17:0x00b0, B:20:0x00c2, B:22:0x00cc, B:161:0x0511, B:27:0x00f6, B:29:0x0104, B:32:0x0124, B:34:0x012a, B:36:0x013c, B:38:0x014a, B:40:0x015a, B:41:0x0167, B:42:0x016c, B:45:0x0185, B:54:0x01ba, B:57:0x01c4, B:59:0x01d2, B:64:0x0224, B:60:0x01f4, B:62:0x0206, B:68:0x0235, B:70:0x0261, B:71:0x028b, B:73:0x02c3, B:75:0x02c9, B:78:0x02d5, B:80:0x030b, B:81:0x0326, B:83:0x032c, B:85:0x033c, B:90:0x0354, B:86:0x0344, B:94:0x035d, B:97:0x0365, B:98:0x037d, B:100:0x0396, B:101:0x03a2, B:104:0x03ae, B:110:0x03d1, B:107:0x03c0, B:133:0x0455, B:135:0x0461, B:138:0x0474, B:140:0x0486, B:142:0x0492, B:160:0x04ff, B:148:0x04aa, B:150:0x04b8, B:153:0x04cd, B:155:0x04df, B:157:0x04eb, B:114:0x03db, B:116:0x03e7, B:118:0x03f3, B:131:0x0439, B:123:0x0411, B:126:0x0423, B:128:0x0429, B:130:0x0433, B:164:0x0523, B:166:0x0531, B:168:0x053c, B:179:0x056e, B:169:0x0544, B:171:0x054f, B:173:0x0555, B:176:0x0561, B:178:0x0569, B:180:0x0571, B:181:0x057d, B:184:0x0585, B:186:0x0597, B:187:0x05a3, B:189:0x05ab, B:193:0x05d0, B:195:0x05f5, B:197:0x0606, B:199:0x060c, B:201:0x0618, B:202:0x0647, B:204:0x064d, B:206:0x065b, B:207:0x065f, B:208:0x0662, B:209:0x0665, B:210:0x0673, B:212:0x0679, B:214:0x0689, B:215:0x0690, B:217:0x069c, B:218:0x06a3, B:219:0x06a6, B:221:0x06e4, B:222:0x06f7, B:224:0x06fd, B:227:0x0718, B:229:0x0733, B:231:0x074a, B:233:0x074f, B:235:0x0753, B:237:0x0757, B:239:0x0761, B:240:0x076b, B:242:0x076f, B:244:0x0775, B:245:0x0783, B:246:0x078c, B:313:0x09c0, B:248:0x0799, B:250:0x07b0, B:255:0x07ca, B:257:0x07ef, B:258:0x07f7, B:260:0x07fd, B:262:0x080f, B:268:0x0825, B:270:0x083a, B:271:0x085d, B:273:0x0869, B:275:0x087e, B:276:0x08ba, B:282:0x08d6, B:284:0x08e1, B:286:0x08e5, B:288:0x08e9, B:290:0x08ed, B:291:0x08f9, B:292:0x08fe, B:294:0x0904, B:296:0x091d, B:297:0x0922, B:312:0x09bd, B:298:0x0939, B:300:0x093e, B:304:0x0965, B:306:0x098d, B:307:0x0994, B:311:0x09b0, B:301:0x094b, B:253:0x07b6, B:314:0x09c9, B:316:0x09d6, B:317:0x09dc, B:318:0x09e4, B:320:0x09ea, B:322:0x0a01, B:324:0x0a12, B:344:0x0a82, B:346:0x0a88, B:348:0x0aa0, B:351:0x0aa7, B:356:0x0ad6, B:358:0x0b19, B:361:0x0b4e, B:362:0x0b52, B:363:0x0b5d, B:365:0x0ba0, B:366:0x0bad, B:368:0x0bbc, B:371:0x0bd5, B:373:0x0bee, B:360:0x0b2b, B:352:0x0aaf, B:354:0x0abb, B:355:0x0abf, B:374:0x0c05, B:375:0x0c1d, B:378:0x0c25, B:379:0x0c2a, B:380:0x0c3a, B:382:0x0c54, B:383:0x0c6f, B:384:0x0c78, B:388:0x0c96, B:387:0x0c83, B:325:0x0a2a, B:327:0x0a30, B:329:0x0a38, B:331:0x0a3f, B:337:0x0a4d, B:339:0x0a54, B:341:0x0a73, B:343:0x0a7a, B:342:0x0a77, B:338:0x0a51, B:330:0x0a3c, B:190:0x05b0, B:192:0x05b6, B:391:0x0ca9), top: B:400:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0823 A[PHI: r13
  0x0823: PHI (r13v14 long) = (r13v13 long), (r13v26 long) binds: [B:256:0x07ed, B:442:0x0823] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x083a A[Catch: all -> 0x00e8, TryCatch #2 {all -> 0x00e8, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x007a, B:17:0x00b0, B:20:0x00c2, B:22:0x00cc, B:161:0x0511, B:27:0x00f6, B:29:0x0104, B:32:0x0124, B:34:0x012a, B:36:0x013c, B:38:0x014a, B:40:0x015a, B:41:0x0167, B:42:0x016c, B:45:0x0185, B:54:0x01ba, B:57:0x01c4, B:59:0x01d2, B:64:0x0224, B:60:0x01f4, B:62:0x0206, B:68:0x0235, B:70:0x0261, B:71:0x028b, B:73:0x02c3, B:75:0x02c9, B:78:0x02d5, B:80:0x030b, B:81:0x0326, B:83:0x032c, B:85:0x033c, B:90:0x0354, B:86:0x0344, B:94:0x035d, B:97:0x0365, B:98:0x037d, B:100:0x0396, B:101:0x03a2, B:104:0x03ae, B:110:0x03d1, B:107:0x03c0, B:133:0x0455, B:135:0x0461, B:138:0x0474, B:140:0x0486, B:142:0x0492, B:160:0x04ff, B:148:0x04aa, B:150:0x04b8, B:153:0x04cd, B:155:0x04df, B:157:0x04eb, B:114:0x03db, B:116:0x03e7, B:118:0x03f3, B:131:0x0439, B:123:0x0411, B:126:0x0423, B:128:0x0429, B:130:0x0433, B:164:0x0523, B:166:0x0531, B:168:0x053c, B:179:0x056e, B:169:0x0544, B:171:0x054f, B:173:0x0555, B:176:0x0561, B:178:0x0569, B:180:0x0571, B:181:0x057d, B:184:0x0585, B:186:0x0597, B:187:0x05a3, B:189:0x05ab, B:193:0x05d0, B:195:0x05f5, B:197:0x0606, B:199:0x060c, B:201:0x0618, B:202:0x0647, B:204:0x064d, B:206:0x065b, B:207:0x065f, B:208:0x0662, B:209:0x0665, B:210:0x0673, B:212:0x0679, B:214:0x0689, B:215:0x0690, B:217:0x069c, B:218:0x06a3, B:219:0x06a6, B:221:0x06e4, B:222:0x06f7, B:224:0x06fd, B:227:0x0718, B:229:0x0733, B:231:0x074a, B:233:0x074f, B:235:0x0753, B:237:0x0757, B:239:0x0761, B:240:0x076b, B:242:0x076f, B:244:0x0775, B:245:0x0783, B:246:0x078c, B:313:0x09c0, B:248:0x0799, B:250:0x07b0, B:255:0x07ca, B:257:0x07ef, B:258:0x07f7, B:260:0x07fd, B:262:0x080f, B:268:0x0825, B:270:0x083a, B:271:0x085d, B:273:0x0869, B:275:0x087e, B:276:0x08ba, B:282:0x08d6, B:284:0x08e1, B:286:0x08e5, B:288:0x08e9, B:290:0x08ed, B:291:0x08f9, B:292:0x08fe, B:294:0x0904, B:296:0x091d, B:297:0x0922, B:312:0x09bd, B:298:0x0939, B:300:0x093e, B:304:0x0965, B:306:0x098d, B:307:0x0994, B:311:0x09b0, B:301:0x094b, B:253:0x07b6, B:314:0x09c9, B:316:0x09d6, B:317:0x09dc, B:318:0x09e4, B:320:0x09ea, B:322:0x0a01, B:324:0x0a12, B:344:0x0a82, B:346:0x0a88, B:348:0x0aa0, B:351:0x0aa7, B:356:0x0ad6, B:358:0x0b19, B:361:0x0b4e, B:362:0x0b52, B:363:0x0b5d, B:365:0x0ba0, B:366:0x0bad, B:368:0x0bbc, B:371:0x0bd5, B:373:0x0bee, B:360:0x0b2b, B:352:0x0aaf, B:354:0x0abb, B:355:0x0abf, B:374:0x0c05, B:375:0x0c1d, B:378:0x0c25, B:379:0x0c2a, B:380:0x0c3a, B:382:0x0c54, B:383:0x0c6f, B:384:0x0c78, B:388:0x0c96, B:387:0x0c83, B:325:0x0a2a, B:327:0x0a30, B:329:0x0a38, B:331:0x0a3f, B:337:0x0a4d, B:339:0x0a54, B:341:0x0a73, B:343:0x0a7a, B:342:0x0a77, B:338:0x0a51, B:330:0x0a3c, B:190:0x05b0, B:192:0x05b6, B:391:0x0ca9), top: B:400:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x085d A[Catch: all -> 0x00e8, TryCatch #2 {all -> 0x00e8, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x007a, B:17:0x00b0, B:20:0x00c2, B:22:0x00cc, B:161:0x0511, B:27:0x00f6, B:29:0x0104, B:32:0x0124, B:34:0x012a, B:36:0x013c, B:38:0x014a, B:40:0x015a, B:41:0x0167, B:42:0x016c, B:45:0x0185, B:54:0x01ba, B:57:0x01c4, B:59:0x01d2, B:64:0x0224, B:60:0x01f4, B:62:0x0206, B:68:0x0235, B:70:0x0261, B:71:0x028b, B:73:0x02c3, B:75:0x02c9, B:78:0x02d5, B:80:0x030b, B:81:0x0326, B:83:0x032c, B:85:0x033c, B:90:0x0354, B:86:0x0344, B:94:0x035d, B:97:0x0365, B:98:0x037d, B:100:0x0396, B:101:0x03a2, B:104:0x03ae, B:110:0x03d1, B:107:0x03c0, B:133:0x0455, B:135:0x0461, B:138:0x0474, B:140:0x0486, B:142:0x0492, B:160:0x04ff, B:148:0x04aa, B:150:0x04b8, B:153:0x04cd, B:155:0x04df, B:157:0x04eb, B:114:0x03db, B:116:0x03e7, B:118:0x03f3, B:131:0x0439, B:123:0x0411, B:126:0x0423, B:128:0x0429, B:130:0x0433, B:164:0x0523, B:166:0x0531, B:168:0x053c, B:179:0x056e, B:169:0x0544, B:171:0x054f, B:173:0x0555, B:176:0x0561, B:178:0x0569, B:180:0x0571, B:181:0x057d, B:184:0x0585, B:186:0x0597, B:187:0x05a3, B:189:0x05ab, B:193:0x05d0, B:195:0x05f5, B:197:0x0606, B:199:0x060c, B:201:0x0618, B:202:0x0647, B:204:0x064d, B:206:0x065b, B:207:0x065f, B:208:0x0662, B:209:0x0665, B:210:0x0673, B:212:0x0679, B:214:0x0689, B:215:0x0690, B:217:0x069c, B:218:0x06a3, B:219:0x06a6, B:221:0x06e4, B:222:0x06f7, B:224:0x06fd, B:227:0x0718, B:229:0x0733, B:231:0x074a, B:233:0x074f, B:235:0x0753, B:237:0x0757, B:239:0x0761, B:240:0x076b, B:242:0x076f, B:244:0x0775, B:245:0x0783, B:246:0x078c, B:313:0x09c0, B:248:0x0799, B:250:0x07b0, B:255:0x07ca, B:257:0x07ef, B:258:0x07f7, B:260:0x07fd, B:262:0x080f, B:268:0x0825, B:270:0x083a, B:271:0x085d, B:273:0x0869, B:275:0x087e, B:276:0x08ba, B:282:0x08d6, B:284:0x08e1, B:286:0x08e5, B:288:0x08e9, B:290:0x08ed, B:291:0x08f9, B:292:0x08fe, B:294:0x0904, B:296:0x091d, B:297:0x0922, B:312:0x09bd, B:298:0x0939, B:300:0x093e, B:304:0x0965, B:306:0x098d, B:307:0x0994, B:311:0x09b0, B:301:0x094b, B:253:0x07b6, B:314:0x09c9, B:316:0x09d6, B:317:0x09dc, B:318:0x09e4, B:320:0x09ea, B:322:0x0a01, B:324:0x0a12, B:344:0x0a82, B:346:0x0a88, B:348:0x0aa0, B:351:0x0aa7, B:356:0x0ad6, B:358:0x0b19, B:361:0x0b4e, B:362:0x0b52, B:363:0x0b5d, B:365:0x0ba0, B:366:0x0bad, B:368:0x0bbc, B:371:0x0bd5, B:373:0x0bee, B:360:0x0b2b, B:352:0x0aaf, B:354:0x0abb, B:355:0x0abf, B:374:0x0c05, B:375:0x0c1d, B:378:0x0c25, B:379:0x0c2a, B:380:0x0c3a, B:382:0x0c54, B:383:0x0c6f, B:384:0x0c78, B:388:0x0c96, B:387:0x0c83, B:325:0x0a2a, B:327:0x0a30, B:329:0x0a38, B:331:0x0a3f, B:337:0x0a4d, B:339:0x0a54, B:341:0x0a73, B:343:0x0a7a, B:342:0x0a77, B:338:0x0a51, B:330:0x0a3c, B:190:0x05b0, B:192:0x05b6, B:391:0x0ca9), top: B:400:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0b2b A[Catch: all -> 0x00e8, TryCatch #2 {all -> 0x00e8, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x007a, B:17:0x00b0, B:20:0x00c2, B:22:0x00cc, B:161:0x0511, B:27:0x00f6, B:29:0x0104, B:32:0x0124, B:34:0x012a, B:36:0x013c, B:38:0x014a, B:40:0x015a, B:41:0x0167, B:42:0x016c, B:45:0x0185, B:54:0x01ba, B:57:0x01c4, B:59:0x01d2, B:64:0x0224, B:60:0x01f4, B:62:0x0206, B:68:0x0235, B:70:0x0261, B:71:0x028b, B:73:0x02c3, B:75:0x02c9, B:78:0x02d5, B:80:0x030b, B:81:0x0326, B:83:0x032c, B:85:0x033c, B:90:0x0354, B:86:0x0344, B:94:0x035d, B:97:0x0365, B:98:0x037d, B:100:0x0396, B:101:0x03a2, B:104:0x03ae, B:110:0x03d1, B:107:0x03c0, B:133:0x0455, B:135:0x0461, B:138:0x0474, B:140:0x0486, B:142:0x0492, B:160:0x04ff, B:148:0x04aa, B:150:0x04b8, B:153:0x04cd, B:155:0x04df, B:157:0x04eb, B:114:0x03db, B:116:0x03e7, B:118:0x03f3, B:131:0x0439, B:123:0x0411, B:126:0x0423, B:128:0x0429, B:130:0x0433, B:164:0x0523, B:166:0x0531, B:168:0x053c, B:179:0x056e, B:169:0x0544, B:171:0x054f, B:173:0x0555, B:176:0x0561, B:178:0x0569, B:180:0x0571, B:181:0x057d, B:184:0x0585, B:186:0x0597, B:187:0x05a3, B:189:0x05ab, B:193:0x05d0, B:195:0x05f5, B:197:0x0606, B:199:0x060c, B:201:0x0618, B:202:0x0647, B:204:0x064d, B:206:0x065b, B:207:0x065f, B:208:0x0662, B:209:0x0665, B:210:0x0673, B:212:0x0679, B:214:0x0689, B:215:0x0690, B:217:0x069c, B:218:0x06a3, B:219:0x06a6, B:221:0x06e4, B:222:0x06f7, B:224:0x06fd, B:227:0x0718, B:229:0x0733, B:231:0x074a, B:233:0x074f, B:235:0x0753, B:237:0x0757, B:239:0x0761, B:240:0x076b, B:242:0x076f, B:244:0x0775, B:245:0x0783, B:246:0x078c, B:313:0x09c0, B:248:0x0799, B:250:0x07b0, B:255:0x07ca, B:257:0x07ef, B:258:0x07f7, B:260:0x07fd, B:262:0x080f, B:268:0x0825, B:270:0x083a, B:271:0x085d, B:273:0x0869, B:275:0x087e, B:276:0x08ba, B:282:0x08d6, B:284:0x08e1, B:286:0x08e5, B:288:0x08e9, B:290:0x08ed, B:291:0x08f9, B:292:0x08fe, B:294:0x0904, B:296:0x091d, B:297:0x0922, B:312:0x09bd, B:298:0x0939, B:300:0x093e, B:304:0x0965, B:306:0x098d, B:307:0x0994, B:311:0x09b0, B:301:0x094b, B:253:0x07b6, B:314:0x09c9, B:316:0x09d6, B:317:0x09dc, B:318:0x09e4, B:320:0x09ea, B:322:0x0a01, B:324:0x0a12, B:344:0x0a82, B:346:0x0a88, B:348:0x0aa0, B:351:0x0aa7, B:356:0x0ad6, B:358:0x0b19, B:361:0x0b4e, B:362:0x0b52, B:363:0x0b5d, B:365:0x0ba0, B:366:0x0bad, B:368:0x0bbc, B:371:0x0bd5, B:373:0x0bee, B:360:0x0b2b, B:352:0x0aaf, B:354:0x0abb, B:355:0x0abf, B:374:0x0c05, B:375:0x0c1d, B:378:0x0c25, B:379:0x0c2a, B:380:0x0c3a, B:382:0x0c54, B:383:0x0c6f, B:384:0x0c78, B:388:0x0c96, B:387:0x0c83, B:325:0x0a2a, B:327:0x0a30, B:329:0x0a38, B:331:0x0a3f, B:337:0x0a4d, B:339:0x0a54, B:341:0x0a73, B:343:0x0a7a, B:342:0x0a77, B:338:0x0a51, B:330:0x0a3c, B:190:0x05b0, B:192:0x05b6, B:391:0x0ca9), top: B:400:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0365 A[Catch: all -> 0x00e8, TryCatch #2 {all -> 0x00e8, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x007a, B:17:0x00b0, B:20:0x00c2, B:22:0x00cc, B:161:0x0511, B:27:0x00f6, B:29:0x0104, B:32:0x0124, B:34:0x012a, B:36:0x013c, B:38:0x014a, B:40:0x015a, B:41:0x0167, B:42:0x016c, B:45:0x0185, B:54:0x01ba, B:57:0x01c4, B:59:0x01d2, B:64:0x0224, B:60:0x01f4, B:62:0x0206, B:68:0x0235, B:70:0x0261, B:71:0x028b, B:73:0x02c3, B:75:0x02c9, B:78:0x02d5, B:80:0x030b, B:81:0x0326, B:83:0x032c, B:85:0x033c, B:90:0x0354, B:86:0x0344, B:94:0x035d, B:97:0x0365, B:98:0x037d, B:100:0x0396, B:101:0x03a2, B:104:0x03ae, B:110:0x03d1, B:107:0x03c0, B:133:0x0455, B:135:0x0461, B:138:0x0474, B:140:0x0486, B:142:0x0492, B:160:0x04ff, B:148:0x04aa, B:150:0x04b8, B:153:0x04cd, B:155:0x04df, B:157:0x04eb, B:114:0x03db, B:116:0x03e7, B:118:0x03f3, B:131:0x0439, B:123:0x0411, B:126:0x0423, B:128:0x0429, B:130:0x0433, B:164:0x0523, B:166:0x0531, B:168:0x053c, B:179:0x056e, B:169:0x0544, B:171:0x054f, B:173:0x0555, B:176:0x0561, B:178:0x0569, B:180:0x0571, B:181:0x057d, B:184:0x0585, B:186:0x0597, B:187:0x05a3, B:189:0x05ab, B:193:0x05d0, B:195:0x05f5, B:197:0x0606, B:199:0x060c, B:201:0x0618, B:202:0x0647, B:204:0x064d, B:206:0x065b, B:207:0x065f, B:208:0x0662, B:209:0x0665, B:210:0x0673, B:212:0x0679, B:214:0x0689, B:215:0x0690, B:217:0x069c, B:218:0x06a3, B:219:0x06a6, B:221:0x06e4, B:222:0x06f7, B:224:0x06fd, B:227:0x0718, B:229:0x0733, B:231:0x074a, B:233:0x074f, B:235:0x0753, B:237:0x0757, B:239:0x0761, B:240:0x076b, B:242:0x076f, B:244:0x0775, B:245:0x0783, B:246:0x078c, B:313:0x09c0, B:248:0x0799, B:250:0x07b0, B:255:0x07ca, B:257:0x07ef, B:258:0x07f7, B:260:0x07fd, B:262:0x080f, B:268:0x0825, B:270:0x083a, B:271:0x085d, B:273:0x0869, B:275:0x087e, B:276:0x08ba, B:282:0x08d6, B:284:0x08e1, B:286:0x08e5, B:288:0x08e9, B:290:0x08ed, B:291:0x08f9, B:292:0x08fe, B:294:0x0904, B:296:0x091d, B:297:0x0922, B:312:0x09bd, B:298:0x0939, B:300:0x093e, B:304:0x0965, B:306:0x098d, B:307:0x0994, B:311:0x09b0, B:301:0x094b, B:253:0x07b6, B:314:0x09c9, B:316:0x09d6, B:317:0x09dc, B:318:0x09e4, B:320:0x09ea, B:322:0x0a01, B:324:0x0a12, B:344:0x0a82, B:346:0x0a88, B:348:0x0aa0, B:351:0x0aa7, B:356:0x0ad6, B:358:0x0b19, B:361:0x0b4e, B:362:0x0b52, B:363:0x0b5d, B:365:0x0ba0, B:366:0x0bad, B:368:0x0bbc, B:371:0x0bd5, B:373:0x0bee, B:360:0x0b2b, B:352:0x0aaf, B:354:0x0abb, B:355:0x0abf, B:374:0x0c05, B:375:0x0c1d, B:378:0x0c25, B:379:0x0c2a, B:380:0x0c3a, B:382:0x0c54, B:383:0x0c6f, B:384:0x0c78, B:388:0x0c96, B:387:0x0c83, B:325:0x0a2a, B:327:0x0a30, B:329:0x0a38, B:331:0x0a3f, B:337:0x0a4d, B:339:0x0a54, B:341:0x0a73, B:343:0x0a7a, B:342:0x0a77, B:338:0x0a51, B:330:0x0a3c, B:190:0x05b0, B:192:0x05b6, B:391:0x0ca9), top: B:400:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x037d A[Catch: all -> 0x00e8, TryCatch #2 {all -> 0x00e8, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x007a, B:17:0x00b0, B:20:0x00c2, B:22:0x00cc, B:161:0x0511, B:27:0x00f6, B:29:0x0104, B:32:0x0124, B:34:0x012a, B:36:0x013c, B:38:0x014a, B:40:0x015a, B:41:0x0167, B:42:0x016c, B:45:0x0185, B:54:0x01ba, B:57:0x01c4, B:59:0x01d2, B:64:0x0224, B:60:0x01f4, B:62:0x0206, B:68:0x0235, B:70:0x0261, B:71:0x028b, B:73:0x02c3, B:75:0x02c9, B:78:0x02d5, B:80:0x030b, B:81:0x0326, B:83:0x032c, B:85:0x033c, B:90:0x0354, B:86:0x0344, B:94:0x035d, B:97:0x0365, B:98:0x037d, B:100:0x0396, B:101:0x03a2, B:104:0x03ae, B:110:0x03d1, B:107:0x03c0, B:133:0x0455, B:135:0x0461, B:138:0x0474, B:140:0x0486, B:142:0x0492, B:160:0x04ff, B:148:0x04aa, B:150:0x04b8, B:153:0x04cd, B:155:0x04df, B:157:0x04eb, B:114:0x03db, B:116:0x03e7, B:118:0x03f3, B:131:0x0439, B:123:0x0411, B:126:0x0423, B:128:0x0429, B:130:0x0433, B:164:0x0523, B:166:0x0531, B:168:0x053c, B:179:0x056e, B:169:0x0544, B:171:0x054f, B:173:0x0555, B:176:0x0561, B:178:0x0569, B:180:0x0571, B:181:0x057d, B:184:0x0585, B:186:0x0597, B:187:0x05a3, B:189:0x05ab, B:193:0x05d0, B:195:0x05f5, B:197:0x0606, B:199:0x060c, B:201:0x0618, B:202:0x0647, B:204:0x064d, B:206:0x065b, B:207:0x065f, B:208:0x0662, B:209:0x0665, B:210:0x0673, B:212:0x0679, B:214:0x0689, B:215:0x0690, B:217:0x069c, B:218:0x06a3, B:219:0x06a6, B:221:0x06e4, B:222:0x06f7, B:224:0x06fd, B:227:0x0718, B:229:0x0733, B:231:0x074a, B:233:0x074f, B:235:0x0753, B:237:0x0757, B:239:0x0761, B:240:0x076b, B:242:0x076f, B:244:0x0775, B:245:0x0783, B:246:0x078c, B:313:0x09c0, B:248:0x0799, B:250:0x07b0, B:255:0x07ca, B:257:0x07ef, B:258:0x07f7, B:260:0x07fd, B:262:0x080f, B:268:0x0825, B:270:0x083a, B:271:0x085d, B:273:0x0869, B:275:0x087e, B:276:0x08ba, B:282:0x08d6, B:284:0x08e1, B:286:0x08e5, B:288:0x08e9, B:290:0x08ed, B:291:0x08f9, B:292:0x08fe, B:294:0x0904, B:296:0x091d, B:297:0x0922, B:312:0x09bd, B:298:0x0939, B:300:0x093e, B:304:0x0965, B:306:0x098d, B:307:0x0994, B:311:0x09b0, B:301:0x094b, B:253:0x07b6, B:314:0x09c9, B:316:0x09d6, B:317:0x09dc, B:318:0x09e4, B:320:0x09ea, B:322:0x0a01, B:324:0x0a12, B:344:0x0a82, B:346:0x0a88, B:348:0x0aa0, B:351:0x0aa7, B:356:0x0ad6, B:358:0x0b19, B:361:0x0b4e, B:362:0x0b52, B:363:0x0b5d, B:365:0x0ba0, B:366:0x0bad, B:368:0x0bbc, B:371:0x0bd5, B:373:0x0bee, B:360:0x0b2b, B:352:0x0aaf, B:354:0x0abb, B:355:0x0abf, B:374:0x0c05, B:375:0x0c1d, B:378:0x0c25, B:379:0x0c2a, B:380:0x0c3a, B:382:0x0c54, B:383:0x0c6f, B:384:0x0c78, B:388:0x0c96, B:387:0x0c83, B:325:0x0a2a, B:327:0x0a30, B:329:0x0a38, B:331:0x0a3f, B:337:0x0a4d, B:339:0x0a54, B:341:0x0a73, B:343:0x0a7a, B:342:0x0a77, B:338:0x0a51, B:330:0x0a3c, B:190:0x05b0, B:192:0x05b6, B:391:0x0ca9), top: B:400:0x000e, inners: #0, #1, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean N(java.lang.String r43, long r44) {
        /*
            Method dump skipped, instruction units count: 3268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8812uf3.N(java.lang.String, long):boolean");
    }

    public final boolean O() {
        x().d();
        c();
        C1521Ls1 c1521Ls1 = this.c;
        R(c1521Ls1);
        if (c1521Ls1.n()) {
            return true;
        }
        C1521Ls1 c1521Ls12 = this.c;
        R(c1521Ls12);
        return !TextUtils.isEmpty(c1521Ls12.Z());
    }

    public final boolean P(IN2 in2, IN2 in22) {
        AbstractC7506py0.a("_e".equals(in2.E()));
        R(this.g);
        C9869yQ2 c9869yQ2K = Af3.k((C6507mO2) in2.l(), "_sc");
        String strI = c9869yQ2K == null ? null : c9869yQ2K.I();
        R(this.g);
        C9869yQ2 c9869yQ2K2 = Af3.k((C6507mO2) in22.l(), "_pc");
        String strI2 = c9869yQ2K2 != null ? c9869yQ2K2.I() : null;
        if (strI2 == null || !strI2.equals(strI)) {
            return false;
        }
        AbstractC7506py0.a("_e".equals(in2.E()));
        R(this.g);
        C9869yQ2 c9869yQ2K3 = Af3.k((C6507mO2) in2.l(), "_et");
        if (c9869yQ2K3 == null || !c9869yQ2K3.Y() || c9869yQ2K3.E() <= 0) {
            return true;
        }
        long jE = c9869yQ2K3.E();
        R(this.g);
        C9869yQ2 c9869yQ2K4 = Af3.k((C6507mO2) in22.l(), "_et");
        if (c9869yQ2K4 != null && c9869yQ2K4.E() > 0) {
            jE += c9869yQ2K4.E();
        }
        R(this.g);
        Af3.i(in22, "_et", Long.valueOf(jE));
        R(this.g);
        Af3.i(in2, "_fr", 1L);
        return true;
    }

    public final C8110s73 S(zzq zzqVar) {
        x().d();
        c();
        AbstractC7506py0.l(zzqVar);
        AbstractC7506py0.f(zzqVar.B);
        AbstractC7139of3 abstractC7139of3 = null;
        if (!zzqVar.X.isEmpty()) {
            this.B.put(zzqVar.B, new C7975rf3(this, zzqVar.X));
        }
        C1521Ls1 c1521Ls1 = this.c;
        R(c1521Ls1);
        C8110s73 c8110s73R = c1521Ls1.R(zzqVar.B);
        C3633c83 c3633c83D = c0(zzqVar.B).d(C3633c83.c(zzqVar.W, 100));
        EnumC9512x73 enumC9512x73 = EnumC9512x73.AD_STORAGE;
        String strK = c3633c83D.j(enumC9512x73) ? this.i.k(zzqVar.B, zzqVar.P) : "";
        if (c8110s73R == null) {
            c8110s73R = new C8110s73(this.l, zzqVar.B);
            if (c3633c83D.j(EnumC9512x73.ANALYTICS_STORAGE)) {
                c8110s73R.j(i0(c3633c83D));
            }
            if (c3633c83D.j(enumC9512x73)) {
                c8110s73R.H(strK);
            }
        } else if (c3633c83D.j(enumC9512x73) && strK != null && !strK.equals(c8110s73R.c())) {
            c8110s73R.H(strK);
            if (zzqVar.P && !"00000000-0000-0000-0000-000000000000".equals(this.i.j(zzqVar.B, c3633c83D).first)) {
                c8110s73R.j(i0(c3633c83D));
                C1521Ls1 c1521Ls12 = this.c;
                R(c1521Ls12);
                if (c1521Ls12.X(zzqVar.B, "_id") != null) {
                    C1521Ls1 c1521Ls13 = this.c;
                    R(c1521Ls13);
                    if (c1521Ls13.X(zzqVar.B, "_lair") == null) {
                        If3 if3 = new If3(zzqVar.B, "auto", "_lair", p().a(), 1L);
                        C1521Ls1 c1521Ls14 = this.c;
                        R(c1521Ls14);
                        c1521Ls14.u(if3);
                    }
                }
            }
        } else if (TextUtils.isEmpty(c8110s73R.m0()) && c3633c83D.j(EnumC9512x73.ANALYTICS_STORAGE)) {
            c8110s73R.j(i0(c3633c83D));
        }
        c8110s73R.y(zzqVar.C);
        c8110s73R.h(zzqVar.R);
        if (!TextUtils.isEmpty(zzqVar.L)) {
            c8110s73R.x(zzqVar.L);
        }
        long j = zzqVar.F;
        if (j != 0) {
            c8110s73R.z(j);
        }
        if (!TextUtils.isEmpty(zzqVar.D)) {
            c8110s73R.l(zzqVar.D);
        }
        c8110s73R.m(zzqVar.K);
        String str = zzqVar.E;
        if (str != null) {
            c8110s73R.k(str);
        }
        c8110s73R.u(zzqVar.G);
        c8110s73R.F(zzqVar.I);
        if (!TextUtils.isEmpty(zzqVar.H)) {
            c8110s73R.B(zzqVar.H);
        }
        c8110s73R.i(zzqVar.P);
        c8110s73R.G(zzqVar.S);
        c8110s73R.v(zzqVar.T);
        C6054kn3.b();
        if (U().B(null, AbstractC1311Jr2.o0) || U().B(zzqVar.B, AbstractC1311Jr2.q0)) {
            c8110s73R.J(zzqVar.Y);
        }
        C5760jk3.b();
        if (U().B(null, AbstractC1311Jr2.n0)) {
            c8110s73R.I(zzqVar.U);
        } else {
            C5760jk3.b();
            if (U().B(null, AbstractC1311Jr2.m0)) {
                c8110s73R.I(null);
            }
        }
        On3.b();
        if (U().B(null, AbstractC1311Jr2.s0)) {
            c8110s73R.L(zzqVar.Z);
        }
        C4932gm3.b();
        if (U().B(null, AbstractC1311Jr2.G0)) {
            c8110s73R.M(zzqVar.a0);
        }
        if (c8110s73R.P()) {
            C1521Ls1 c1521Ls15 = this.c;
            R(c1521Ls15);
            c1521Ls15.l(c8110s73R);
        }
        return c8110s73R;
    }

    public final C1705Nm1 T() {
        C1705Nm1 c1705Nm1 = this.f;
        R(c1705Nm1);
        return c1705Nm1;
    }

    public final C5788jq1 U() {
        return ((C9327wU2) AbstractC7506py0.l(this.l)).z();
    }

    public final C1521Ls1 V() {
        C1521Ls1 c1521Ls1 = this.c;
        R(c1521Ls1);
        return c1521Ls1;
    }

    public final C7779qw2 W() {
        return this.l.D();
    }

    public final PC2 X() {
        PC2 pc2 = this.b;
        R(pc2);
        return pc2;
    }

    public final C5618jE2 Y() {
        C5618jE2 c5618jE2 = this.d;
        if (c5618jE2 != null) {
            return c5618jE2;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final QO2 Z() {
        QO2 qo2 = this.a;
        R(qo2);
        return qo2;
    }

    @Override // com.daaw.InterfaceC5027h63
    public final C8292sn1 a() {
        throw null;
    }

    public final void b() {
        x().d();
        c();
        if (this.n) {
            return;
        }
        this.n = true;
        if (E()) {
            FileChannel fileChannel = this.w;
            x().d();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                w().n().a("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i2 = fileChannel.read(byteBufferAllocate);
                    if (i2 == 4) {
                        byteBufferAllocate.flip();
                        i = byteBufferAllocate.getInt();
                    } else if (i2 != -1) {
                        w().t().b("Unexpected data length. Bytes read", Integer.valueOf(i2));
                    }
                } catch (IOException e) {
                    w().n().b("Failed to read from channel", e);
                }
            }
            int iL = this.l.B().l();
            x().d();
            if (i > iL) {
                w().n().c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(iL));
                return;
            }
            if (i < iL) {
                FileChannel fileChannel2 = this.w;
                x().d();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    w().n().a("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iL);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            w().n().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        w().s().c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(iL));
                        return;
                    } catch (IOException e2) {
                        w().n().b("Failed to write to channel", e2);
                    }
                }
                w().n().c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(iL));
            }
        }
    }

    public final C9327wU2 b0() {
        return this.l;
    }

    public final void c() {
        if (!this.m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final C3633c83 c0(String str) {
        String string;
        C3633c83 c3633c83 = C3633c83.c;
        x().d();
        c();
        C3633c83 c3633c832 = (C3633c83) this.A.get(str);
        if (c3633c832 != null) {
            return c3633c832;
        }
        C1521Ls1 c1521Ls1 = this.c;
        R(c1521Ls1);
        AbstractC7506py0.l(str);
        c1521Ls1.d();
        c1521Ls1.e();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = c1521Ls1.P().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                if (cursorRawQuery.moveToFirst()) {
                    string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                } else {
                    cursorRawQuery.close();
                    string = "G1";
                }
                C3633c83 c3633c83C = C3633c83.c(string, 100);
                A(str, c3633c83C);
                return c3633c83C;
            } catch (SQLiteException e) {
                c1521Ls1.a.w().n().c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final void d(String str, QT2 qt2) {
        int iU;
        int iIndexOf;
        QO2 qo2 = this.a;
        R(qo2);
        Set setY = qo2.y(str);
        if (setY != null) {
            qt2.y0(setY);
        }
        QO2 qo22 = this.a;
        R(qo22);
        if (qo22.J(str)) {
            qt2.F0();
        }
        QO2 qo23 = this.a;
        R(qo23);
        if (qo23.M(str)) {
            if (U().B(str, AbstractC1311Jr2.t0)) {
                String strO0 = qt2.o0();
                if (!TextUtils.isEmpty(strO0) && (iIndexOf = strO0.indexOf(".")) != -1) {
                    qt2.S(strO0.substring(0, iIndexOf));
                }
            } else {
                qt2.K0();
            }
        }
        QO2 qo24 = this.a;
        R(qo24);
        if (qo24.N(str) && (iU = Af3.u(qt2, "_id")) != -1) {
            qt2.q(iU);
        }
        QO2 qo25 = this.a;
        R(qo25);
        if (qo25.L(str)) {
            qt2.G0();
        }
        QO2 qo26 = this.a;
        R(qo26);
        if (qo26.I(str)) {
            qt2.D0();
            C7975rf3 c7975rf3 = (C7975rf3) this.B.get(str);
            if (c7975rf3 == null || c7975rf3.b + U().n(str, AbstractC1311Jr2.V) < p().b()) {
                c7975rf3 = new C7975rf3(this);
                this.B.put(str, c7975rf3);
            }
            qt2.J(c7975rf3.a);
        }
        QO2 qo27 = this.a;
        R(qo27);
        if (qo27.K(str)) {
            qt2.O0();
        }
    }

    public final C4031db3 d0() {
        C4031db3 c4031db3 = this.h;
        R(c4031db3);
        return c4031db3;
    }

    public final void e(C8110s73 c8110s73) {
        x().d();
        if (TextUtils.isEmpty(c8110s73.a()) && TextUtils.isEmpty(c8110s73.j0())) {
            j((String) AbstractC7506py0.l(c8110s73.l0()), 204, null, null, null);
            return;
        }
        He3 he3 = this.j;
        Uri.Builder builder = new Uri.Builder();
        String strA = c8110s73.a();
        if (TextUtils.isEmpty(strA)) {
            strA = c8110s73.j0();
        }
        C2407Ua c2407Ua = null;
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) AbstractC1311Jr2.g.a(null)).encodedAuthority((String) AbstractC1311Jr2.h.a(null)).path("config/app/".concat(String.valueOf(strA))).appendQueryParameter("platform", "android");
        he3.a.z().m();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(79000L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            String str = (String) AbstractC7506py0.l(c8110s73.l0());
            URL url = new URL(string);
            w().s().b("Fetching remote configuration", str);
            QO2 qo2 = this.a;
            R(qo2);
            C9271wG2 c9271wG2Q = qo2.q(str);
            QO2 qo22 = this.a;
            R(qo22);
            String strS = qo22.s(str);
            if (c9271wG2Q != null) {
                if (!TextUtils.isEmpty(strS)) {
                    c2407Ua = new C2407Ua();
                    c2407Ua.put("If-Modified-Since", strS);
                }
                QO2 qo23 = this.a;
                R(qo23);
                String strR = qo23.r(str);
                if (!TextUtils.isEmpty(strR)) {
                    if (c2407Ua == null) {
                        c2407Ua = new C2407Ua();
                    }
                    c2407Ua.put("If-None-Match", strR);
                }
            }
            this.s = true;
            PC2 pc2 = this.b;
            R(pc2);
            Pe3 pe3 = new Pe3(this);
            pc2.d();
            pc2.e();
            AbstractC7506py0.l(url);
            AbstractC7506py0.l(pe3);
            pc2.a.x().y(new RunnableC6180lC2(pc2, str, url, null, c2407Ua, pe3));
        } catch (MalformedURLException unused) {
            w().n().c("Failed to parse config URL. Not fetching. appId", C6675mz2.z(c8110s73.l0()), string);
        }
    }

    public final Bd3 e0() {
        return this.i;
    }

    public final void f(zzau zzauVar, zzq zzqVar) {
        List<zzac> listB0;
        List<zzac> listB02;
        List<zzac> listB03;
        String str;
        AbstractC7506py0.l(zzqVar);
        AbstractC7506py0.f(zzqVar.B);
        x().d();
        c();
        String str2 = zzqVar.B;
        long j = zzauVar.E;
        C2092Qz2 c2092Qz2B = C2092Qz2.b(zzauVar);
        x().d();
        C5715jb3 c5715jb3 = null;
        if (this.C != null && (str = this.D) != null && str.equals(str2)) {
            c5715jb3 = this.C;
        }
        Pf3.y(c5715jb3, c2092Qz2B.d, false);
        zzau zzauVarA = c2092Qz2B.a();
        R(this.g);
        if (Af3.j(zzauVarA, zzqVar)) {
            if (!zzqVar.I) {
                S(zzqVar);
                return;
            }
            List list = zzqVar.U;
            if (list != null) {
                if (!list.contains(zzauVarA.B)) {
                    w().m().d("Dropping non-safelisted event. appId, event name, origin", str2, zzauVarA.B, zzauVarA.D);
                    return;
                } else {
                    Bundle bundleM = zzauVarA.C.m();
                    bundleM.putLong("ga_safelisted", 1L);
                    zzauVarA = new zzau(zzauVarA.B, new zzas(bundleM), zzauVarA.D, zzauVarA.E);
                }
            }
            C1521Ls1 c1521Ls1 = this.c;
            R(c1521Ls1);
            c1521Ls1.e0();
            try {
                C1521Ls1 c1521Ls12 = this.c;
                R(c1521Ls12);
                AbstractC7506py0.f(str2);
                c1521Ls12.d();
                c1521Ls12.e();
                if (j < 0) {
                    c1521Ls12.a.w().t().c("Invalid time querying timed out conditional properties", C6675mz2.z(str2), Long.valueOf(j));
                    listB0 = Collections.EMPTY_LIST;
                } else {
                    listB0 = c1521Ls12.b0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzac zzacVar : listB0) {
                    if (zzacVar != null) {
                        w().s().d("User property timed out", zzacVar.B, this.l.D().f(zzacVar.D.C), zzacVar.D.e());
                        zzau zzauVar2 = zzacVar.H;
                        if (zzauVar2 != null) {
                            D(new zzau(zzauVar2, j), zzqVar);
                        }
                        C1521Ls1 c1521Ls13 = this.c;
                        R(c1521Ls13);
                        c1521Ls13.J(str2, zzacVar.D.C);
                    }
                }
                C1521Ls1 c1521Ls14 = this.c;
                R(c1521Ls14);
                AbstractC7506py0.f(str2);
                c1521Ls14.d();
                c1521Ls14.e();
                if (j < 0) {
                    c1521Ls14.a.w().t().c("Invalid time querying expired conditional properties", C6675mz2.z(str2), Long.valueOf(j));
                    listB02 = Collections.EMPTY_LIST;
                } else {
                    listB02 = c1521Ls14.b0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(listB02.size());
                for (zzac zzacVar2 : listB02) {
                    if (zzacVar2 != null) {
                        w().s().d("User property expired", zzacVar2.B, this.l.D().f(zzacVar2.D.C), zzacVar2.D.e());
                        C1521Ls1 c1521Ls15 = this.c;
                        R(c1521Ls15);
                        c1521Ls15.i(str2, zzacVar2.D.C);
                        zzau zzauVar3 = zzacVar2.L;
                        if (zzauVar3 != null) {
                            arrayList.add(zzauVar3);
                        }
                        C1521Ls1 c1521Ls16 = this.c;
                        R(c1521Ls16);
                        c1521Ls16.J(str2, zzacVar2.D.C);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    D(new zzau((zzau) it.next(), j), zzqVar);
                }
                C1521Ls1 c1521Ls17 = this.c;
                R(c1521Ls17);
                String str3 = zzauVarA.B;
                AbstractC7506py0.f(str2);
                AbstractC7506py0.f(str3);
                c1521Ls17.d();
                c1521Ls17.e();
                if (j < 0) {
                    c1521Ls17.a.w().t().d("Invalid time querying triggered conditional properties", C6675mz2.z(str2), c1521Ls17.a.D().d(str3), Long.valueOf(j));
                    listB03 = Collections.EMPTY_LIST;
                } else {
                    listB03 = c1521Ls17.b0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(listB03.size());
                for (zzac zzacVar3 : listB03) {
                    if (zzacVar3 != null) {
                        zzlk zzlkVar = zzacVar3.D;
                        If3 if3 = new If3((String) AbstractC7506py0.l(zzacVar3.B), zzacVar3.C, zzlkVar.C, j, AbstractC7506py0.l(zzlkVar.e()));
                        C1521Ls1 c1521Ls18 = this.c;
                        R(c1521Ls18);
                        if (c1521Ls18.u(if3)) {
                            w().s().d("User property triggered", zzacVar3.B, this.l.D().f(if3.c), if3.e);
                        } else {
                            w().n().d("Too many active user properties, ignoring", C6675mz2.z(zzacVar3.B), this.l.D().f(if3.c), if3.e);
                        }
                        zzau zzauVar4 = zzacVar3.J;
                        if (zzauVar4 != null) {
                            arrayList2.add(zzauVar4);
                        }
                        zzacVar3.D = new zzlk(if3);
                        zzacVar3.F = true;
                        C1521Ls1 c1521Ls19 = this.c;
                        R(c1521Ls19);
                        c1521Ls19.t(zzacVar3);
                    }
                }
                D(zzauVarA, zzqVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    D(new zzau((zzau) it2.next(), j), zzqVar);
                }
                C1521Ls1 c1521Ls110 = this.c;
                R(c1521Ls110);
                c1521Ls110.k();
                C1521Ls1 c1521Ls111 = this.c;
                R(c1521Ls111);
                c1521Ls111.f0();
            } catch (Throwable th) {
                C1521Ls1 c1521Ls112 = this.c;
                R(c1521Ls112);
                c1521Ls112.f0();
                throw th;
            }
        }
    }

    public final void g(zzau zzauVar, String str) {
        C1521Ls1 c1521Ls1 = this.c;
        R(c1521Ls1);
        C8110s73 c8110s73R = c1521Ls1.R(str);
        if (c8110s73R == null || TextUtils.isEmpty(c8110s73R.o0())) {
            w().m().b("No app data available; dropping event", str);
            return;
        }
        Boolean boolJ = J(c8110s73R);
        if (boolJ == null) {
            if (!"_ui".equals(zzauVar.B)) {
                w().t().b("Could not find package. appId", C6675mz2.z(str));
            }
        } else if (!boolJ.booleanValue()) {
            w().n().b("App version does not match; dropping event. appId", C6675mz2.z(str));
            return;
        }
        String strA = c8110s73R.a();
        String strO0 = c8110s73R.o0();
        long jR = c8110s73R.R();
        String strN0 = c8110s73R.n0();
        long jC0 = c8110s73R.c0();
        long jZ = c8110s73R.Z();
        boolean zO = c8110s73R.O();
        String strP0 = c8110s73R.p0();
        c8110s73R.A();
        h(zzauVar, new zzq(str, strA, strO0, jR, strN0, jC0, jZ, (String) null, zO, false, strP0, 0L, 0L, 0, c8110s73R.N(), false, c8110s73R.j0(), c8110s73R.i0(), c8110s73R.a0(), c8110s73R.e(), (String) null, c0(str).i(), "", (String) null, c8110s73R.Q(), c8110s73R.h0()));
    }

    public final Af3 g0() {
        Af3 af3 = this.g;
        R(af3);
        return af3;
    }

    public final void h(zzau zzauVar, zzq zzqVar) {
        AbstractC7506py0.f(zzqVar.B);
        C2092Qz2 c2092Qz2B = C2092Qz2.b(zzauVar);
        Pf3 pf3H0 = h0();
        Bundle bundle = c2092Qz2B.d;
        C1521Ls1 c1521Ls1 = this.c;
        R(c1521Ls1);
        pf3H0.z(bundle, c1521Ls1.Q(zzqVar.B));
        h0().B(c2092Qz2B, U().j(zzqVar.B));
        zzau zzauVarA = c2092Qz2B.a();
        if ("_cmp".equals(zzauVarA.B) && "referrer API v2".equals(zzauVarA.C.D("_cis"))) {
            String strD = zzauVarA.C.D("gclid");
            if (!TextUtils.isEmpty(strD)) {
                B(new zzlk("_lgclid", zzauVarA.E, strD, "auto"), zzqVar);
            }
        }
        f(zzauVarA, zzqVar);
    }

    public final Pf3 h0() {
        return ((C9327wU2) AbstractC7506py0.l(this.l)).N();
    }

    public final void i() {
        this.r++;
    }

    public final String i0(C3633c83 c3633c83) {
        if (!c3633c83.j(EnumC9512x73.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        h0().r().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map r12) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8812uf3.j(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final String j0(zzq zzqVar) {
        try {
            return (String) x().o(new CallableC3215af3(this, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            w().n().c("Failed to get app instance id. appId", C6675mz2.z(zzqVar.B), e);
            return null;
        }
    }

    public final void k(boolean z) {
        M();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0151 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x000d, B:7:0x0013, B:50:0x0129, B:55:0x0160, B:54:0x0151, B:14:0x002a, B:38:0x00ca, B:40:0x00df, B:42:0x00e5, B:46:0x00f2, B:45:0x00eb, B:47:0x00f5, B:48:0x00fd, B:49:0x00fe), top: B:60:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r8, java.lang.Throwable r9, byte[] r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8812uf3.l(int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    public final void l0(Runnable runnable) {
        x().d();
        if (this.p == null) {
            this.p = new ArrayList();
        }
        this.p.add(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x052e A[Catch: all -> 0x00c3, TryCatch #1 {all -> 0x00c3, blocks: (B:23:0x00a8, B:25:0x00b5, B:45:0x0101, B:47:0x0115, B:49:0x012d, B:50:0x0154, B:52:0x01ac, B:54:0x01b4, B:58:0x01c0, B:66:0x01f4, B:68:0x01ff, B:72:0x020c, B:75:0x021a, B:79:0x0225, B:81:0x0229, B:82:0x024a, B:84:0x024f, B:87:0x026e, B:91:0x0282, B:93:0x02ae, B:96:0x02b6, B:98:0x02c5, B:127:0x03ab, B:129:0x03d7, B:130:0x03da, B:132:0x0403, B:172:0x04cc, B:173:0x04cf, B:181:0x054c, B:134:0x0418, B:139:0x043d, B:141:0x0445, B:143:0x044b, B:147:0x045e, B:151:0x0471, B:155:0x047d, B:158:0x048b, B:163:0x04af, B:165:0x04b5, B:167:0x04bd, B:169:0x04c3, B:161:0x049c, B:149:0x0469, B:137:0x0429, B:99:0x02d6, B:101:0x0301, B:102:0x0312, B:104:0x0319, B:106:0x031f, B:108:0x0329, B:110:0x032f, B:112:0x0335, B:114:0x033b, B:115:0x0340, B:121:0x0364, B:123:0x0368, B:124:0x037c, B:125:0x038c, B:126:0x039c, B:174:0x04e5, B:176:0x0515, B:177:0x0518, B:178:0x052e, B:180:0x0532, B:85:0x025e, B:62:0x01d8, B:31:0x00c6, B:33:0x00ca, B:37:0x00db, B:39:0x00ec, B:41:0x00f6, B:44:0x00fe), top: B:189:0x00a8, inners: #0, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f4 A[Catch: all -> 0x00c3, TryCatch #1 {all -> 0x00c3, blocks: (B:23:0x00a8, B:25:0x00b5, B:45:0x0101, B:47:0x0115, B:49:0x012d, B:50:0x0154, B:52:0x01ac, B:54:0x01b4, B:58:0x01c0, B:66:0x01f4, B:68:0x01ff, B:72:0x020c, B:75:0x021a, B:79:0x0225, B:81:0x0229, B:82:0x024a, B:84:0x024f, B:87:0x026e, B:91:0x0282, B:93:0x02ae, B:96:0x02b6, B:98:0x02c5, B:127:0x03ab, B:129:0x03d7, B:130:0x03da, B:132:0x0403, B:172:0x04cc, B:173:0x04cf, B:181:0x054c, B:134:0x0418, B:139:0x043d, B:141:0x0445, B:143:0x044b, B:147:0x045e, B:151:0x0471, B:155:0x047d, B:158:0x048b, B:163:0x04af, B:165:0x04b5, B:167:0x04bd, B:169:0x04c3, B:161:0x049c, B:149:0x0469, B:137:0x0429, B:99:0x02d6, B:101:0x0301, B:102:0x0312, B:104:0x0319, B:106:0x031f, B:108:0x0329, B:110:0x032f, B:112:0x0335, B:114:0x033b, B:115:0x0340, B:121:0x0364, B:123:0x0368, B:124:0x037c, B:125:0x038c, B:126:0x039c, B:174:0x04e5, B:176:0x0515, B:177:0x0518, B:178:0x052e, B:180:0x0532, B:85:0x025e, B:62:0x01d8, B:31:0x00c6, B:33:0x00ca, B:37:0x00db, B:39:0x00ec, B:41:0x00f6, B:44:0x00fe), top: B:189:0x00a8, inners: #0, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024f A[Catch: all -> 0x00c3, TryCatch #1 {all -> 0x00c3, blocks: (B:23:0x00a8, B:25:0x00b5, B:45:0x0101, B:47:0x0115, B:49:0x012d, B:50:0x0154, B:52:0x01ac, B:54:0x01b4, B:58:0x01c0, B:66:0x01f4, B:68:0x01ff, B:72:0x020c, B:75:0x021a, B:79:0x0225, B:81:0x0229, B:82:0x024a, B:84:0x024f, B:87:0x026e, B:91:0x0282, B:93:0x02ae, B:96:0x02b6, B:98:0x02c5, B:127:0x03ab, B:129:0x03d7, B:130:0x03da, B:132:0x0403, B:172:0x04cc, B:173:0x04cf, B:181:0x054c, B:134:0x0418, B:139:0x043d, B:141:0x0445, B:143:0x044b, B:147:0x045e, B:151:0x0471, B:155:0x047d, B:158:0x048b, B:163:0x04af, B:165:0x04b5, B:167:0x04bd, B:169:0x04c3, B:161:0x049c, B:149:0x0469, B:137:0x0429, B:99:0x02d6, B:101:0x0301, B:102:0x0312, B:104:0x0319, B:106:0x031f, B:108:0x0329, B:110:0x032f, B:112:0x0335, B:114:0x033b, B:115:0x0340, B:121:0x0364, B:123:0x0368, B:124:0x037c, B:125:0x038c, B:126:0x039c, B:174:0x04e5, B:176:0x0515, B:177:0x0518, B:178:0x052e, B:180:0x0532, B:85:0x025e, B:62:0x01d8, B:31:0x00c6, B:33:0x00ca, B:37:0x00db, B:39:0x00ec, B:41:0x00f6, B:44:0x00fe), top: B:189:0x00a8, inners: #0, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025e A[Catch: all -> 0x00c3, TryCatch #1 {all -> 0x00c3, blocks: (B:23:0x00a8, B:25:0x00b5, B:45:0x0101, B:47:0x0115, B:49:0x012d, B:50:0x0154, B:52:0x01ac, B:54:0x01b4, B:58:0x01c0, B:66:0x01f4, B:68:0x01ff, B:72:0x020c, B:75:0x021a, B:79:0x0225, B:81:0x0229, B:82:0x024a, B:84:0x024f, B:87:0x026e, B:91:0x0282, B:93:0x02ae, B:96:0x02b6, B:98:0x02c5, B:127:0x03ab, B:129:0x03d7, B:130:0x03da, B:132:0x0403, B:172:0x04cc, B:173:0x04cf, B:181:0x054c, B:134:0x0418, B:139:0x043d, B:141:0x0445, B:143:0x044b, B:147:0x045e, B:151:0x0471, B:155:0x047d, B:158:0x048b, B:163:0x04af, B:165:0x04b5, B:167:0x04bd, B:169:0x04c3, B:161:0x049c, B:149:0x0469, B:137:0x0429, B:99:0x02d6, B:101:0x0301, B:102:0x0312, B:104:0x0319, B:106:0x031f, B:108:0x0329, B:110:0x032f, B:112:0x0335, B:114:0x033b, B:115:0x0340, B:121:0x0364, B:123:0x0368, B:124:0x037c, B:125:0x038c, B:126:0x039c, B:174:0x04e5, B:176:0x0515, B:177:0x0518, B:178:0x052e, B:180:0x0532, B:85:0x025e, B:62:0x01d8, B:31:0x00c6, B:33:0x00ca, B:37:0x00db, B:39:0x00ec, B:41:0x00f6, B:44:0x00fe), top: B:189:0x00a8, inners: #0, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026e A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #1 {all -> 0x00c3, blocks: (B:23:0x00a8, B:25:0x00b5, B:45:0x0101, B:47:0x0115, B:49:0x012d, B:50:0x0154, B:52:0x01ac, B:54:0x01b4, B:58:0x01c0, B:66:0x01f4, B:68:0x01ff, B:72:0x020c, B:75:0x021a, B:79:0x0225, B:81:0x0229, B:82:0x024a, B:84:0x024f, B:87:0x026e, B:91:0x0282, B:93:0x02ae, B:96:0x02b6, B:98:0x02c5, B:127:0x03ab, B:129:0x03d7, B:130:0x03da, B:132:0x0403, B:172:0x04cc, B:173:0x04cf, B:181:0x054c, B:134:0x0418, B:139:0x043d, B:141:0x0445, B:143:0x044b, B:147:0x045e, B:151:0x0471, B:155:0x047d, B:158:0x048b, B:163:0x04af, B:165:0x04b5, B:167:0x04bd, B:169:0x04c3, B:161:0x049c, B:149:0x0469, B:137:0x0429, B:99:0x02d6, B:101:0x0301, B:102:0x0312, B:104:0x0319, B:106:0x031f, B:108:0x0329, B:110:0x032f, B:112:0x0335, B:114:0x033b, B:115:0x0340, B:121:0x0364, B:123:0x0368, B:124:0x037c, B:125:0x038c, B:126:0x039c, B:174:0x04e5, B:176:0x0515, B:177:0x0518, B:178:0x052e, B:180:0x0532, B:85:0x025e, B:62:0x01d8, B:31:0x00c6, B:33:0x00ca, B:37:0x00db, B:39:0x00ec, B:41:0x00f6, B:44:0x00fe), top: B:189:0x00a8, inners: #0, #3, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(com.google.android.gms.measurement.internal.zzq r27) {
        /*
            Method dump skipped, instruction units count: 1383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8812uf3.m(com.google.android.gms.measurement.internal.zzq):void");
    }

    public final void n() {
        this.q++;
    }

    public final void o(zzac zzacVar) {
        zzq zzqVarI = I((String) AbstractC7506py0.l(zzacVar.B));
        if (zzqVarI != null) {
            q(zzacVar, zzqVarI);
        }
    }

    @Override // com.daaw.InterfaceC5027h63
    public final InterfaceC5485im p() {
        return ((C9327wU2) AbstractC7506py0.l(this.l)).p();
    }

    public final void q(zzac zzacVar, zzq zzqVar) {
        AbstractC7506py0.l(zzacVar);
        AbstractC7506py0.f(zzacVar.B);
        AbstractC7506py0.l(zzacVar.D);
        AbstractC7506py0.f(zzacVar.D.C);
        x().d();
        c();
        if (Q(zzqVar)) {
            if (!zzqVar.I) {
                S(zzqVar);
                return;
            }
            C1521Ls1 c1521Ls1 = this.c;
            R(c1521Ls1);
            c1521Ls1.e0();
            try {
                S(zzqVar);
                String str = (String) AbstractC7506py0.l(zzacVar.B);
                C1521Ls1 c1521Ls12 = this.c;
                R(c1521Ls12);
                zzac zzacVarS = c1521Ls12.S(str, zzacVar.D.C);
                if (zzacVarS != null) {
                    w().m().c("Removing conditional user property", zzacVar.B, this.l.D().f(zzacVar.D.C));
                    C1521Ls1 c1521Ls13 = this.c;
                    R(c1521Ls13);
                    c1521Ls13.J(str, zzacVar.D.C);
                    if (zzacVarS.F) {
                        C1521Ls1 c1521Ls14 = this.c;
                        R(c1521Ls14);
                        c1521Ls14.i(str, zzacVar.D.C);
                    }
                    zzau zzauVar = zzacVar.L;
                    if (zzauVar != null) {
                        zzas zzasVar = zzauVar.C;
                        D((zzau) AbstractC7506py0.l(h0().y0(str, ((zzau) AbstractC7506py0.l(zzacVar.L)).B, zzasVar != null ? zzasVar.m() : null, zzacVarS.C, zzacVar.L.E, true, true)), zzqVar);
                    }
                } else {
                    w().t().c("Conditional user property doesn't exist", C6675mz2.z(zzacVar.B), this.l.D().f(zzacVar.D.C));
                }
                C1521Ls1 c1521Ls15 = this.c;
                R(c1521Ls15);
                c1521Ls15.k();
                C1521Ls1 c1521Ls16 = this.c;
                R(c1521Ls16);
                c1521Ls16.f0();
            } catch (Throwable th) {
                C1521Ls1 c1521Ls17 = this.c;
                R(c1521Ls17);
                c1521Ls17.f0();
                throw th;
            }
        }
    }

    public final void r(String str, zzq zzqVar) {
        x().d();
        c();
        if (Q(zzqVar)) {
            if (!zzqVar.I) {
                S(zzqVar);
                return;
            }
            if ("_npa".equals(str) && zzqVar.S != null) {
                w().m().a("Falling back to manifest metadata value for ad personalization");
                B(new zzlk("_npa", p().a(), Long.valueOf(true != zzqVar.S.booleanValue() ? 0L : 1L), "auto"), zzqVar);
                return;
            }
            w().m().b("Removing user property", this.l.D().f(str));
            C1521Ls1 c1521Ls1 = this.c;
            R(c1521Ls1);
            c1521Ls1.e0();
            try {
                S(zzqVar);
                if ("_id".equals(str)) {
                    C1521Ls1 c1521Ls12 = this.c;
                    R(c1521Ls12);
                    c1521Ls12.i((String) AbstractC7506py0.l(zzqVar.B), "_lair");
                }
                C1521Ls1 c1521Ls13 = this.c;
                R(c1521Ls13);
                c1521Ls13.i((String) AbstractC7506py0.l(zzqVar.B), str);
                C1521Ls1 c1521Ls14 = this.c;
                R(c1521Ls14);
                c1521Ls14.k();
                w().m().b("User property removed", this.l.D().f(str));
                C1521Ls1 c1521Ls15 = this.c;
                R(c1521Ls15);
                c1521Ls15.f0();
            } catch (Throwable th) {
                C1521Ls1 c1521Ls16 = this.c;
                R(c1521Ls16);
                c1521Ls16.f0();
                throw th;
            }
        }
    }

    public final void s(zzq zzqVar) {
        if (this.x != null) {
            ArrayList arrayList = new ArrayList();
            this.y = arrayList;
            arrayList.addAll(this.x);
        }
        C1521Ls1 c1521Ls1 = this.c;
        R(c1521Ls1);
        String str = (String) AbstractC7506py0.l(zzqVar.B);
        AbstractC7506py0.f(str);
        c1521Ls1.d();
        c1521Ls1.e();
        try {
            SQLiteDatabase sQLiteDatabaseP = c1521Ls1.P();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseP.delete("apps", "app_id=?", strArr) + sQLiteDatabaseP.delete("events", "app_id=?", strArr) + sQLiteDatabaseP.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseP.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseP.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseP.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseP.delete("queue", "app_id=?", strArr) + sQLiteDatabaseP.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseP.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseP.delete("default_event_params", "app_id=?", strArr);
            if (iDelete > 0) {
                c1521Ls1.a.w().s().c("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            c1521Ls1.a.w().n().c("Error resetting analytics data. appId, error", C6675mz2.z(str), e);
        }
        if (zzqVar.I) {
            m(zzqVar);
        }
    }

    public final void t(String str, C5715jb3 c5715jb3) {
        x().d();
        String str2 = this.D;
        if (str2 == null || str2.equals(str) || c5715jb3 != null) {
            this.D = str;
            this.C = c5715jb3;
        }
    }

    public final void u() {
        x().d();
        C1521Ls1 c1521Ls1 = this.c;
        R(c1521Ls1);
        c1521Ls1.h0();
        if (this.i.g.a() == 0) {
            this.i.g.b(p().a());
        }
        M();
    }

    @Override // com.daaw.InterfaceC5027h63
    public final Context v() {
        return this.l.v();
    }

    @Override // com.daaw.InterfaceC5027h63
    public final C6675mz2 w() {
        return ((C9327wU2) AbstractC7506py0.l(this.l)).w();
    }

    @Override // com.daaw.InterfaceC5027h63
    public final KS2 x() {
        return ((C9327wU2) AbstractC7506py0.l(this.l)).x();
    }

    public final void y(zzac zzacVar) {
        zzq zzqVarI = I((String) AbstractC7506py0.l(zzacVar.B));
        if (zzqVarI != null) {
            z(zzacVar, zzqVarI);
        }
    }

    public final void z(zzac zzacVar, zzq zzqVar) {
        AbstractC7506py0.l(zzacVar);
        AbstractC7506py0.f(zzacVar.B);
        AbstractC7506py0.l(zzacVar.C);
        AbstractC7506py0.l(zzacVar.D);
        AbstractC7506py0.f(zzacVar.D.C);
        x().d();
        c();
        if (Q(zzqVar)) {
            if (!zzqVar.I) {
                S(zzqVar);
                return;
            }
            zzac zzacVar2 = new zzac(zzacVar);
            boolean z = false;
            zzacVar2.F = false;
            C1521Ls1 c1521Ls1 = this.c;
            R(c1521Ls1);
            c1521Ls1.e0();
            try {
                C1521Ls1 c1521Ls12 = this.c;
                R(c1521Ls12);
                zzac zzacVarS = c1521Ls12.S((String) AbstractC7506py0.l(zzacVar2.B), zzacVar2.D.C);
                if (zzacVarS != null && !zzacVarS.C.equals(zzacVar2.C)) {
                    w().t().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.l.D().f(zzacVar2.D.C), zzacVar2.C, zzacVarS.C);
                }
                if (zzacVarS != null && zzacVarS.F) {
                    zzacVar2.C = zzacVarS.C;
                    zzacVar2.E = zzacVarS.E;
                    zzacVar2.I = zzacVarS.I;
                    zzacVar2.G = zzacVarS.G;
                    zzacVar2.J = zzacVarS.J;
                    zzacVar2.F = true;
                    zzlk zzlkVar = zzacVar2.D;
                    zzacVar2.D = new zzlk(zzlkVar.C, zzacVarS.D.D, zzlkVar.e(), zzacVarS.D.G);
                } else if (TextUtils.isEmpty(zzacVar2.G)) {
                    zzlk zzlkVar2 = zzacVar2.D;
                    zzacVar2.D = new zzlk(zzlkVar2.C, zzacVar2.E, zzlkVar2.e(), zzacVar2.D.G);
                    zzacVar2.F = true;
                    z = true;
                }
                if (zzacVar2.F) {
                    zzlk zzlkVar3 = zzacVar2.D;
                    If3 if3 = new If3((String) AbstractC7506py0.l(zzacVar2.B), zzacVar2.C, zzlkVar3.C, zzlkVar3.D, AbstractC7506py0.l(zzlkVar3.e()));
                    C1521Ls1 c1521Ls13 = this.c;
                    R(c1521Ls13);
                    if (c1521Ls13.u(if3)) {
                        w().m().d("User property updated immediately", zzacVar2.B, this.l.D().f(if3.c), if3.e);
                    } else {
                        w().n().d("(2)Too many active user properties, ignoring", C6675mz2.z(zzacVar2.B), this.l.D().f(if3.c), if3.e);
                    }
                    if (z && zzacVar2.J != null) {
                        D(new zzau(zzacVar2.J, zzacVar2.E), zzqVar);
                    }
                }
                C1521Ls1 c1521Ls14 = this.c;
                R(c1521Ls14);
                if (c1521Ls14.t(zzacVar2)) {
                    w().m().d("Conditional property added", zzacVar2.B, this.l.D().f(zzacVar2.D.C), zzacVar2.D.e());
                } else {
                    w().n().d("Too many conditional properties, ignoring", C6675mz2.z(zzacVar2.B), this.l.D().f(zzacVar2.D.C), zzacVar2.D.e());
                }
                C1521Ls1 c1521Ls15 = this.c;
                R(c1521Ls15);
                c1521Ls15.k();
                C1521Ls1 c1521Ls16 = this.c;
                R(c1521Ls16);
                c1521Ls16.f0();
            } catch (Throwable th) {
                C1521Ls1 c1521Ls17 = this.c;
                R(c1521Ls17);
                c1521Ls17.f0();
                throw th;
            }
        }
    }
}
