package androidx.room;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.daaw.FM0;
import com.daaw.JZ0;
import com.daaw.NZ0;
import com.daaw.QJ0;
import com.daaw.SS0;
import com.daaw.T10;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static final String[] m = {"UPDATE", "DELETE", "INSERT"};
    public final String[] b;
    public Map c;
    public final QJ0 d;
    public volatile NZ0 g;
    public b h;
    public final T10 i;
    public androidx.room.d k;
    public AtomicBoolean e = new AtomicBoolean(false);
    public volatile boolean f = false;
    public final FM0 j = new FM0();
    public Runnable l = new a();
    public final HashMap a = new HashMap();

    public class a implements Runnable {
        public a() {
        }

        public final Set a() {
            HashSet hashSet = new HashSet();
            Cursor cursorP = c.this.d.p(new SS0("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (cursorP.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(cursorP.getInt(0)));
                } catch (Throwable th) {
                    cursorP.close();
                    throw th;
                }
            }
            cursorP.close();
            if (!hashSet.isEmpty()) {
                c.this.g.z();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Lock lockH = c.this.d.h();
            Set setA = null;
            try {
                try {
                    lockH.lock();
                } catch (SQLiteException | IllegalStateException unused) {
                }
                if (!c.this.c()) {
                    lockH.unlock();
                    return;
                }
                if (!c.this.e.compareAndSet(true, false)) {
                    lockH.unlock();
                    return;
                }
                if (c.this.d.k()) {
                    lockH.unlock();
                    return;
                }
                QJ0 qj0 = c.this.d;
                if (qj0.g) {
                    JZ0 jz0E0 = qj0.i().e0();
                    jz0E0.m();
                    try {
                        setA = a();
                        jz0E0.T();
                        jz0E0.l0();
                    } catch (Throwable th) {
                        jz0E0.l0();
                        throw th;
                    }
                } else {
                    setA = a();
                }
                lockH.unlock();
                if (setA == null || setA.isEmpty()) {
                    return;
                }
                synchronized (c.this.j) {
                    try {
                        Iterator it = c.this.j.iterator();
                        while (it.hasNext()) {
                            ((d) ((Map.Entry) it.next()).getValue()).a(setA);
                        }
                    } finally {
                    }
                }
            } finally {
                lockH.unlock();
            }
        }
    }

    public static class b {
        public final long[] a;
        public final boolean[] b;
        public final int[] c;
        public boolean d;
        public boolean e;

        public b(int i) {
            long[] jArr = new long[i];
            this.a = jArr;
            boolean[] zArr = new boolean[i];
            this.b = zArr;
            this.c = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public int[] a() {
            synchronized (this) {
                try {
                    if (this.d && !this.e) {
                        int length = this.a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i >= length) {
                                this.e = true;
                                this.d = false;
                                return this.c;
                            }
                            boolean z = this.a[i] > 0;
                            boolean[] zArr = this.b;
                            if (z != zArr[i]) {
                                int[] iArr = this.c;
                                if (!z) {
                                    i2 = 2;
                                }
                                iArr[i] = i2;
                            } else {
                                this.c[i] = 0;
                            }
                            zArr[i] = z;
                            i++;
                        }
                    }
                    return null;
                } finally {
                }
            }
        }

        public boolean b(int... iArr) {
            boolean z;
            synchronized (this) {
                try {
                    z = false;
                    for (int i : iArr) {
                        long[] jArr = this.a;
                        long j = jArr[i];
                        jArr[i] = 1 + j;
                        if (j == 0) {
                            z = true;
                            this.d = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        public boolean c(int... iArr) {
            boolean z;
            synchronized (this) {
                try {
                    z = false;
                    for (int i : iArr) {
                        long[] jArr = this.a;
                        long j = jArr[i];
                        jArr[i] = j - 1;
                        if (j == 1) {
                            z = true;
                            this.d = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        public void d() {
            synchronized (this) {
                this.e = false;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0033c {
        public final String[] a;

        public AbstractC0033c(String[] strArr) {
            this.a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public abstract boolean a();

        public abstract void b(Set set);
    }

    public static class d {
        public final int[] a;
        public final String[] b;
        public final AbstractC0033c c;
        public final Set d;

        public d(AbstractC0033c abstractC0033c, int[] iArr, String[] strArr) {
            this.c = abstractC0033c;
            this.a = iArr;
            this.b = strArr;
            if (iArr.length != 1) {
                this.d = null;
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.d = DesugarCollections.unmodifiableSet(hashSet);
        }

        public void a(Set set) {
            int length = this.a.length;
            Set hashSet = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.a[i]))) {
                    if (length == 1) {
                        hashSet = this.d;
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet(length);
                        }
                        hashSet.add(this.b[i]);
                    }
                }
            }
            if (hashSet != null) {
                this.c.b(hashSet);
            }
        }

        public void b(String[] strArr) {
            Set set = null;
            if (this.b.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (strArr[i].equalsIgnoreCase(this.b[0])) {
                        set = this.d;
                        break;
                    }
                    i++;
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.b;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            String str2 = strArr2[i2];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i2++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.c.b(set);
            }
        }
    }

    public c(QJ0 qj0, Map map, Map map2, String... strArr) {
        this.d = qj0;
        this.h = new b(strArr.length);
        this.c = map2;
        this.i = new T10(qj0);
        int length = strArr.length;
        this.b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.a.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) map.get(strArr[i]);
            if (str2 != null) {
                this.b[i] = str2.toLowerCase(locale);
            } else {
                this.b[i] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap map3 = this.a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    public static void b(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    public void a(AbstractC0033c abstractC0033c) {
        d dVar;
        String[] strArrH = h(abstractC0033c.a);
        int[] iArr = new int[strArrH.length];
        int length = strArrH.length;
        for (int i = 0; i < length; i++) {
            Integer num = (Integer) this.a.get(strArrH[i].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + strArrH[i]);
            }
            iArr[i] = num.intValue();
        }
        d dVar2 = new d(abstractC0033c, iArr, strArrH);
        synchronized (this.j) {
            dVar = (d) this.j.v(abstractC0033c, dVar2);
        }
        if (dVar == null && this.h.b(iArr)) {
            l();
        }
    }

    public boolean c() {
        if (!this.d.o()) {
            return false;
        }
        if (!this.f) {
            this.d.i().e0();
        }
        return this.f;
    }

    public void d(JZ0 jz0) {
        synchronized (this) {
            try {
                if (this.f) {
                    return;
                }
                jz0.v("PRAGMA temp_store = MEMORY;");
                jz0.v("PRAGMA recursive_triggers='ON';");
                jz0.v("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                m(jz0);
                this.g = jz0.A("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                this.f = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(String... strArr) {
        synchronized (this.j) {
            try {
                for (Map.Entry entry : this.j) {
                    if (!((AbstractC0033c) entry.getKey()).a()) {
                        ((d) entry.getValue()).b(strArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        if (this.e.compareAndSet(false, true)) {
            this.d.j().execute(this.l);
        }
    }

    public void g(AbstractC0033c abstractC0033c) {
        d dVar;
        synchronized (this.j) {
            dVar = (d) this.j.w(abstractC0033c);
        }
        if (dVar == null || !this.h.c(dVar.a)) {
            return;
        }
        l();
    }

    public final String[] h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.c.containsKey(lowerCase)) {
                hashSet.addAll((Collection) this.c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public void i(Context context, String str) {
        this.k = new androidx.room.d(context, str, this, this.d.j());
    }

    public final void j(JZ0 jz0, int i) {
        jz0.v("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : m) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            jz0.v(sb.toString());
        }
    }

    public final void k(JZ0 jz0, int i) {
        String str = this.b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : m) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            b(sb, str, str2);
            jz0.v(sb.toString());
        }
    }

    public void l() {
        if (this.d.o()) {
            m(this.d.i().e0());
        }
    }

    public void m(JZ0 jz0) {
        if (jz0.F0()) {
            return;
        }
        while (true) {
            try {
                Lock lockH = this.d.h();
                lockH.lock();
                try {
                    int[] iArrA = this.h.a();
                    if (iArrA == null) {
                        return;
                    }
                    int length = iArrA.length;
                    jz0.m();
                    for (int i = 0; i < length; i++) {
                        try {
                            int i2 = iArrA[i];
                            if (i2 == 1) {
                                j(jz0, i);
                            } else if (i2 == 2) {
                                k(jz0, i);
                            }
                        } finally {
                        }
                    }
                    jz0.T();
                    jz0.l0();
                    this.h.d();
                } finally {
                    lockH.unlock();
                }
            } catch (SQLiteException | IllegalStateException unused) {
                return;
            }
        }
    }
}
