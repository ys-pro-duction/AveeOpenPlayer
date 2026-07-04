package com.daaw;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.daaw.C0629Dd0;
import com.daaw.C2659Wl;
import com.daaw.InterfaceC3591c01;
import com.daaw.KH;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.nL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6772nL0 implements XH, InterfaceC3591c01, InterfaceC2033Ql, AutoCloseable {
    public static final EG G = EG.b("proto");
    public final KN0 B;
    public final InterfaceC6333lm C;
    public final InterfaceC6333lm D;
    public final YH E;
    public final InterfaceC7290pB0 F;

    /* JADX INFO: renamed from: com.daaw.nL0$b */
    public interface b {
        Object apply(Object obj);
    }

    /* JADX INFO: renamed from: com.daaw.nL0$c */
    public static class c {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* JADX INFO: renamed from: com.daaw.nL0$d */
    public interface d {
        Object a();
    }

    public C6772nL0(InterfaceC6333lm interfaceC6333lm, InterfaceC6333lm interfaceC6333lm2, YH yh, KN0 kn0, InterfaceC7290pB0 interfaceC7290pB0) {
        this.B = kn0;
        this.C = interfaceC6333lm;
        this.D = interfaceC6333lm2;
        this.E = yh;
        this.F = interfaceC7290pB0;
    }

    public static String A1(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC1628Mt0) it.next()).c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ Object B0(String str, C0629Dd0.b bVar, long j, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) B1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.b())}), new b() { // from class: com.daaw.ZK0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.b())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(bVar.b()));
        contentValues.put("events_dropped_count", Long.valueOf(j));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    public static Object B1(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Object E0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ Object F(C6772nL0 c6772nL0, Cursor cursor) {
        c6772nL0.getClass();
        while (cursor.moveToNext()) {
            c6772nL0.j(cursor.getInt(0), C0629Dd0.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ SQLiteDatabase I(Throwable th) {
        throw new C3313b01("Timed out while trying to open db.", th);
    }

    public static /* synthetic */ Integer K0(final C6772nL0 c6772nL0, long j, SQLiteDatabase sQLiteDatabase) {
        c6772nL0.getClass();
        String[] strArr = {String.valueOf(j)};
        B1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: com.daaw.TK0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.N(this.a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object N(C6772nL0 c6772nL0, Cursor cursor) {
        c6772nL0.getClass();
        while (cursor.moveToNext()) {
            c6772nL0.j(cursor.getInt(0), C0629Dd0.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Object Q0(C6772nL0 c6772nL0, List list, H51 h51, Cursor cursor) {
        c6772nL0.getClass();
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            KH.a aVarK = KH.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z) {
                aVarK.h(new C10105zG(z1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarK.h(new C10105zG(z1(cursor.getString(4)), c6772nL0.x1(j)));
            }
            if (!cursor.isNull(6)) {
                aVarK.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC1628Mt0.a(j, h51, aVarK.d()));
        }
        return null;
    }

    public static /* synthetic */ Object R(final C6772nL0 c6772nL0, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        c6772nL0.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        B1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: com.daaw.WK0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.F(this.a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Boolean U(C6772nL0 c6772nL0, H51 h51, SQLiteDatabase sQLiteDatabase) {
        Long lP1 = c6772nL0.p1(sQLiteDatabase, h51);
        return lP1 == null ? Boolean.FALSE : (Boolean) B1(c6772nL0.k1().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lP1.toString()}), new b() { // from class: com.daaw.VK0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ Object W(long j, H51 h51, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{h51.b(), String.valueOf(AbstractC9748xz0.a(h51.d()))}) < 1) {
            contentValues.put("backend_name", h51.b());
            contentValues.put("priority", Integer.valueOf(AbstractC9748xz0.a(h51.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ byte[] Y(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            byte[] bArr2 = (byte[]) arrayList.get(i);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ Object Y0(C6772nL0 c6772nL0, SQLiteDatabase sQLiteDatabase) {
        c6772nL0.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c6772nL0.C.a()).execute();
        return null;
    }

    public static /* synthetic */ C2659Wl b1(final C6772nL0 c6772nL0, String str, final Map map, final C2659Wl.a aVar, SQLiteDatabase sQLiteDatabase) {
        c6772nL0.getClass();
        return (C2659Wl) B1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: com.daaw.bL0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.p0(this.a, map, aVar, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long c1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ J31 f1(final long j, SQLiteDatabase sQLiteDatabase) {
        return (J31) B1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: com.daaw.eL0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.l(j, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ J31 l(long j, Cursor cursor) {
        cursor.moveToNext();
        return J31.c().c(cursor.getLong(0)).b(j).a();
    }

    public static /* synthetic */ List o(C6772nL0 c6772nL0, H51 h51, SQLiteDatabase sQLiteDatabase) {
        List listT1 = c6772nL0.t1(sQLiteDatabase, h51, c6772nL0.E.d());
        for (EnumC8911uz0 enumC8911uz0 : EnumC8911uz0.values()) {
            if (enumC8911uz0 != h51.d()) {
                int iD = c6772nL0.E.d() - listT1.size();
                if (iD <= 0) {
                    break;
                }
                listT1.addAll(c6772nL0.t1(sQLiteDatabase, h51.f(enumC8911uz0), iD));
            }
        }
        return c6772nL0.s1(listT1, c6772nL0.u1(sQLiteDatabase, listT1));
    }

    public static /* synthetic */ List o0(SQLiteDatabase sQLiteDatabase) {
        return (List) B1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: com.daaw.lL0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.s((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ C2659Wl p0(C6772nL0 c6772nL0, Map map, C2659Wl.a aVar, Cursor cursor) {
        c6772nL0.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C0629Dd0.b bVarG1 = c6772nL0.g1(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C0629Dd0.c().c(bVarG1).b(j).a());
        }
        c6772nL0.w1(aVar, map);
        aVar.e(c6772nL0.o1());
        aVar.d(c6772nL0.l1());
        aVar.c((String) c6772nL0.F.get());
        return aVar.b();
    }

    public static /* synthetic */ List s(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(H51.a().b(cursor.getString(1)).d(AbstractC9748xz0.b(cursor.getInt(2))).c(v1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Long s0(C6772nL0 c6772nL0, KH kh, H51 h51, SQLiteDatabase sQLiteDatabase) {
        if (c6772nL0.r1()) {
            c6772nL0.j(1L, C0629Dd0.b.CACHE_FULL, kh.j());
            return -1L;
        }
        long jI1 = c6772nL0.i1(sQLiteDatabase, h51);
        int iE = c6772nL0.E.e();
        byte[] bArrA = kh.e().a();
        boolean z = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jI1));
        contentValues.put("transport_name", kh.j());
        contentValues.put("timestamp_ms", Long.valueOf(kh.f()));
        contentValues.put("uptime_ms", Long.valueOf(kh.k()));
        contentValues.put("payload_encoding", kh.e().b().a());
        contentValues.put("code", kh.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? bArrA : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i = 1; i <= iCeil; i++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i - 1) * iE, Math.min(i * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : kh.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    public static byte[] v1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ Object w0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Long x0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ Object y0(Throwable th) {
        throw new C3313b01("Timed out while trying to acquire the lock.", th);
    }

    public static EG z1(String str) {
        return str == null ? G : EG.b(str);
    }

    @Override // com.daaw.XH
    public boolean D(final H51 h51) {
        return ((Boolean) q1(new b() { // from class: com.daaw.PK0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.U(this.a, h51, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // com.daaw.XH
    public long I0(H51 h51) {
        return ((Long) B1(k1().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{h51.b(), String.valueOf(AbstractC9748xz0.a(h51.d()))}), new b() { // from class: com.daaw.iL0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.c1((Cursor) obj);
            }
        })).longValue();
    }

    @Override // com.daaw.XH
    public Iterable O() {
        return (Iterable) q1(new b() { // from class: com.daaw.hL0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.o0((SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.daaw.XH
    public void P(final H51 h51, final long j) {
        q1(new b() { // from class: com.daaw.QK0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.W(j, h51, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.daaw.XH
    public void U0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + A1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            q1(new b() { // from class: com.daaw.mL0
                @Override // com.daaw.C6772nL0.b
                public final Object apply(Object obj) {
                    return C6772nL0.R(this.a, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // com.daaw.XH
    public AbstractC1628Mt0 X(final H51 h51, final KH kh) {
        AbstractC2732Xd0.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", h51.d(), kh.j(), h51.b());
        long jLongValue = ((Long) q1(new b() { // from class: com.daaw.jL0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.s0(this.a, kh, h51, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC1628Mt0.a(jLongValue, h51, kh);
    }

    @Override // com.daaw.InterfaceC2033Ql
    public void a() {
        q1(new b() { // from class: com.daaw.RK0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.Y0(this.a, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.daaw.XH
    public Iterable a0(final H51 h51) {
        return (Iterable) q1(new b() { // from class: com.daaw.NK0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.o(this.a, h51, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.daaw.InterfaceC2033Ql
    public C2659Wl c() {
        final C2659Wl.a aVarE = C2659Wl.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C2659Wl) q1(new b() { // from class: com.daaw.UK0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.b1(this.a, str, map, aVarE, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.B.close();
    }

    @Override // com.daaw.InterfaceC3591c01
    public Object d(InterfaceC3591c01.a aVar) {
        SQLiteDatabase sQLiteDatabaseK1 = k1();
        h1(sQLiteDatabaseK1);
        try {
            Object objA = aVar.a();
            sQLiteDatabaseK1.setTransactionSuccessful();
            return objA;
        } finally {
            sQLiteDatabaseK1.endTransaction();
        }
    }

    public final C0629Dd0.b g1(int i) {
        C0629Dd0.b bVar = C0629Dd0.b.REASON_UNKNOWN;
        if (i == bVar.b()) {
            return bVar;
        }
        C0629Dd0.b bVar2 = C0629Dd0.b.MESSAGE_TOO_OLD;
        if (i == bVar2.b()) {
            return bVar2;
        }
        C0629Dd0.b bVar3 = C0629Dd0.b.CACHE_FULL;
        if (i == bVar3.b()) {
            return bVar3;
        }
        C0629Dd0.b bVar4 = C0629Dd0.b.PAYLOAD_TOO_BIG;
        if (i == bVar4.b()) {
            return bVar4;
        }
        C0629Dd0.b bVar5 = C0629Dd0.b.MAX_RETRIES_REACHED;
        if (i == bVar5.b()) {
            return bVar5;
        }
        C0629Dd0.b bVar6 = C0629Dd0.b.INVALID_PAYLOD;
        if (i == bVar6.b()) {
            return bVar6;
        }
        C0629Dd0.b bVar7 = C0629Dd0.b.SERVER_ERROR;
        if (i == bVar7.b()) {
            return bVar7;
        }
        AbstractC2732Xd0.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return bVar;
    }

    public final void h1(final SQLiteDatabase sQLiteDatabase) {
        y1(new d() { // from class: com.daaw.MK0
            @Override // com.daaw.C6772nL0.d
            public final Object a() {
                return C6772nL0.w0(sQLiteDatabase);
            }
        }, new b() { // from class: com.daaw.XK0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.y0((Throwable) obj);
            }
        });
    }

    public final long i1(SQLiteDatabase sQLiteDatabase, H51 h51) {
        Long lP1 = p1(sQLiteDatabase, h51);
        if (lP1 != null) {
            return lP1.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", h51.b());
        contentValues.put("priority", Integer.valueOf(AbstractC9748xz0.a(h51.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (h51.c() != null) {
            contentValues.put("extras", Base64.encodeToString(h51.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    @Override // com.daaw.InterfaceC2033Ql
    public void j(final long j, final C0629Dd0.b bVar, final String str) {
        q1(new b() { // from class: com.daaw.SK0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.B0(str, bVar, j, (SQLiteDatabase) obj);
            }
        });
    }

    public long j1() {
        return m1() * n1();
    }

    public SQLiteDatabase k1() {
        final KN0 kn0 = this.B;
        Objects.requireNonNull(kn0);
        return (SQLiteDatabase) y1(new d() { // from class: com.daaw.fL0
            @Override // com.daaw.C6772nL0.d
            public final Object a() {
                return kn0.getWritableDatabase();
            }
        }, new b() { // from class: com.daaw.gL0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.I((Throwable) obj);
            }
        });
    }

    public final C5957kT l1() {
        return C5957kT.b().b(AX0.c().b(j1()).c(YH.a.f()).a()).a();
    }

    public final long m1() {
        return k1().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    @Override // com.daaw.XH
    public int n() {
        final long jA = this.C.a() - this.E.c();
        return ((Integer) q1(new b() { // from class: com.daaw.kL0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.K0(this.a, jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    public final long n1() {
        return k1().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public final J31 o1() {
        final long jA = this.C.a();
        return (J31) q1(new b() { // from class: com.daaw.dL0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.f1(jA, (SQLiteDatabase) obj);
            }
        });
    }

    public final Long p1(SQLiteDatabase sQLiteDatabase, H51 h51) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(h51.b(), String.valueOf(AbstractC9748xz0.a(h51.d()))));
        if (h51.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(h51.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) B1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: com.daaw.OK0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.x0((Cursor) obj);
            }
        });
    }

    @Override // com.daaw.XH
    public void q(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            k1().compileStatement("DELETE FROM events WHERE _id in " + A1(iterable)).execute();
        }
    }

    public Object q1(b bVar) {
        SQLiteDatabase sQLiteDatabaseK1 = k1();
        sQLiteDatabaseK1.beginTransaction();
        try {
            Object objApply = bVar.apply(sQLiteDatabaseK1);
            sQLiteDatabaseK1.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseK1.endTransaction();
        }
    }

    public final boolean r1() {
        return m1() * n1() >= this.E.f();
    }

    public final List s1(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC1628Mt0 abstractC1628Mt0 = (AbstractC1628Mt0) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC1628Mt0.c()))) {
                KH.a aVarL = abstractC1628Mt0.b().l();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC1628Mt0.c()))) {
                    aVarL.c(cVar.a, cVar.b);
                }
                listIterator.set(AbstractC1628Mt0.a(abstractC1628Mt0.c(), abstractC1628Mt0.d(), aVarL.d()));
            }
        }
        return list;
    }

    public final List t1(SQLiteDatabase sQLiteDatabase, final H51 h51, int i) {
        final ArrayList arrayList = new ArrayList();
        Long lP1 = p1(sQLiteDatabase, h51);
        if (lP1 == null) {
            return arrayList;
        }
        B1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lP1.toString()}, null, null, null, String.valueOf(i)), new b() { // from class: com.daaw.YK0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.Q0(this.a, arrayList, h51, (Cursor) obj);
            }
        });
        return arrayList;
    }

    public final Map u1(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(((AbstractC1628Mt0) list.get(i)).c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        B1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: com.daaw.aL0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.E0(map, (Cursor) obj);
            }
        });
        return map;
    }

    public final void w1(C2659Wl.a aVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            aVar.a(C1253Jd0.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    public final byte[] x1(long j) {
        return (byte[]) B1(k1().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new b() { // from class: com.daaw.cL0
            @Override // com.daaw.C6772nL0.b
            public final Object apply(Object obj) {
                return C6772nL0.Y((Cursor) obj);
            }
        });
    }

    public final Object y1(d dVar, b bVar) {
        long jA = this.D.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.D.a() >= ((long) this.E.b()) + jA) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
