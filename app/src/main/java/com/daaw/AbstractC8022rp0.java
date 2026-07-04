package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.rp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8022rp0 {

    /* JADX INFO: renamed from: com.daaw.rp0$a */
    public static final class a {
        public final List a;
        public final Object b;

        public /* synthetic */ a(Object obj, AbstractC8591tr1 abstractC8591tr1) {
            AbstractC7506py0.l(obj);
            this.b = obj;
            this.a = new ArrayList();
        }

        public a a(String str, Object obj) {
            AbstractC7506py0.l(str);
            this.a.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.b.getClass().getSimpleName());
            sb.append('{');
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
