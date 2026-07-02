package com.daaw;

import android.database.Cursor;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class T01 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public static class a {
        public final String a;
        public final String b;
        public final int c;
        public final boolean d;
        public final int e;
        public final String f;
        public final int g;

        public a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.a = str;
            this.b = str2;
            this.d = z;
            this.e = i;
            this.c = a(str2);
            this.f = str3;
            this.g = i2;
        }

        public static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.e != aVar.e || !this.a.equals(aVar.a) || this.d != aVar.d) {
                    return false;
                }
                if (this.g == 1 && aVar.g == 2 && (str3 = this.f) != null && !str3.equals(aVar.f)) {
                    return false;
                }
                if (this.g == 2 && aVar.g == 1 && (str2 = aVar.f) != null && !str2.equals(this.f)) {
                    return false;
                }
                int i = this.g;
                if ((i == 0 || i != aVar.g || ((str = this.f) == null ? aVar.f == null : str.equals(aVar.f))) && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.c) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e;
        }

        public String toString() {
            return "Column{name='" + this.a + "', type='" + this.b + "', affinity='" + this.c + "', notNull=" + this.d + ", primaryKeyPosition=" + this.e + ", defaultValue='" + this.f + "'}";
        }
    }

    public static class b {
        public final String a;
        public final String b;
        public final String c;
        public final List d;
        public final List e;

        public b(String str, String str2, String str3, List list, List list2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = DesugarCollections.unmodifiableList(list);
            this.e = DesugarCollections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                return this.e.equals(bVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + "', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
        }
    }

    public static class c implements Comparable {
        public final int B;
        public final int C;
        public final String D;
        public final String E;

        public c(int i, int i2, String str, String str2) {
            this.B = i;
            this.C = i2;
            this.D = str;
            this.E = str2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i = this.B - cVar.B;
            return i == 0 ? this.C - cVar.C : i;
        }
    }

    public static class d {
        public final String a;
        public final boolean b;
        public final List c;

        public d(String str, boolean z, List list) {
            this.a = str;
            this.b = z;
            this.c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.b == dVar.b && this.c.equals(dVar.c)) {
                return this.a.startsWith("index_") ? dVar.a.startsWith("index_") : this.a.equals(dVar.a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.a.startsWith("index_") ? -1184239155 : this.a.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + '}';
        }
    }

    public T01(String str, Map map, Set set, Set set2) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableMap(map);
        this.c = DesugarCollections.unmodifiableSet(set);
        this.d = set2 == null ? null : DesugarCollections.unmodifiableSet(set2);
    }

    public static T01 a(JZ0 jz0, String str) {
        return new T01(str, b(jz0, str), d(jz0, str), f(jz0, str));
    }

    public static Map b(JZ0 jz0, String str) {
        Cursor cursorH0 = jz0.h0("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorH0.getColumnCount() > 0) {
                int columnIndex = cursorH0.getColumnIndex("name");
                int columnIndex2 = cursorH0.getColumnIndex("type");
                int columnIndex3 = cursorH0.getColumnIndex("notnull");
                int columnIndex4 = cursorH0.getColumnIndex("pk");
                int columnIndex5 = cursorH0.getColumnIndex("dflt_value");
                while (cursorH0.moveToNext()) {
                    String string = cursorH0.getString(columnIndex);
                    map.put(string, new a(string, cursorH0.getString(columnIndex2), cursorH0.getInt(columnIndex3) != 0, cursorH0.getInt(columnIndex4), cursorH0.getString(columnIndex5), 2));
                }
            }
            return map;
        } finally {
            cursorH0.close();
        }
    }

    public static List c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static Set d(JZ0 jz0, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorH0 = jz0.h0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorH0.getColumnIndex("id");
            int columnIndex2 = cursorH0.getColumnIndex("seq");
            int columnIndex3 = cursorH0.getColumnIndex("table");
            int columnIndex4 = cursorH0.getColumnIndex("on_delete");
            int columnIndex5 = cursorH0.getColumnIndex("on_update");
            List<c> listC = c(cursorH0);
            int count = cursorH0.getCount();
            for (int i = 0; i < count; i++) {
                cursorH0.moveToPosition(i);
                if (cursorH0.getInt(columnIndex2) == 0) {
                    int i2 = cursorH0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : listC) {
                        if (cVar.B == i2) {
                            arrayList.add(cVar.D);
                            arrayList2.add(cVar.E);
                        }
                    }
                    hashSet.add(new b(cursorH0.getString(columnIndex3), cursorH0.getString(columnIndex4), cursorH0.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            cursorH0.close();
            return hashSet;
        } catch (Throwable th) {
            cursorH0.close();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    public static d e(JZ0 jz0, String str, boolean z) {
        Cursor cursorH0 = jz0.h0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorH0.getColumnIndex("seqno");
            int columnIndex2 = cursorH0.getColumnIndex("cid");
            int columnIndex3 = cursorH0.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorH0.moveToNext()) {
                    if (cursorH0.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorH0.getInt(columnIndex)), cursorH0.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                d dVar = new d(str, z, arrayList);
                cursorH0.close();
                return dVar;
            }
            cursorH0.close();
            return null;
        } catch (Throwable th) {
            cursorH0.close();
            throw th;
        }
    }

    public static Set f(JZ0 jz0, String str) {
        Cursor cursorH0 = jz0.h0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorH0.getColumnIndex("name");
            int columnIndex2 = cursorH0.getColumnIndex("origin");
            int columnIndex3 = cursorH0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (cursorH0.moveToNext()) {
                    if ("c".equals(cursorH0.getString(columnIndex2))) {
                        String string = cursorH0.getString(columnIndex);
                        boolean z = true;
                        if (cursorH0.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        d dVarE = e(jz0, string, z);
                        if (dVarE == null) {
                            return null;
                        }
                        hashSet.add(dVarE);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            cursorH0.close();
        }
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        T01 t01 = (T01) obj;
        String str = this.a;
        if (str == null ? t01.a != null : !str.equals(t01.a)) {
            return false;
        }
        Map map = this.b;
        if (map == null ? t01.b != null : !map.equals(t01.b)) {
            return false;
        }
        Set set2 = this.c;
        if (set2 == null ? t01.c != null : !set2.equals(t01.c)) {
            return false;
        }
        Set set3 = this.d;
        if (set3 == null || (set = t01.d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
