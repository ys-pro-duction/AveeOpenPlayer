package com.daaw;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.nc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6842nc0 {
    public static final void a(Appendable appendable, Object obj, NQ nq) throws IOException {
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

    public static final Appendable b(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, NQ nq) throws IOException {
        appendable.append(charSequence2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            a(appendable, obj, nq);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String c(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, NQ nq) {
        G10.g(list, "<this>");
        G10.g(charSequence, "separator");
        G10.g(charSequence2, "prefix");
        G10.g(charSequence3, "postfix");
        G10.g(charSequence4, "truncated");
        String string = ((StringBuilder) b(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, nq)).toString();
        G10.f(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return string;
    }

    public static /* synthetic */ String d(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, NQ nq, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            nq = null;
        }
        CharSequence charSequence5 = charSequence4;
        NQ nq2 = nq;
        return c(list, charSequence, charSequence2, charSequence3, i, charSequence5, nq2);
    }

    public static final Set e(List list) {
        G10.g(list, "<this>");
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(list.get(i));
        }
        return hashSet;
    }
}
