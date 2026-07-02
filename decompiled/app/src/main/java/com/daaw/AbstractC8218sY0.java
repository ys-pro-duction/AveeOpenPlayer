package com.daaw;

/* JADX INFO: renamed from: com.daaw.sY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8218sY0 {
    public static void a(Appendable appendable, Object obj, NQ nq) {
        G10.g(appendable, "<this>");
        if (nq != null) {
            appendable.append((CharSequence) nq.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }
}
