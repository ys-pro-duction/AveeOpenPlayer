package com.daaw;

import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.g40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4735g40 {
    public final String a;

    public C4735g40(String str) {
        this.a = (String) AbstractC7785qy0.n(str);
    }

    public static C4735g40 e(char c) {
        return new C4735g40(String.valueOf(c));
    }

    public Appendable a(Appendable appendable, Iterator it) throws IOException {
        AbstractC7785qy0.n(appendable);
        if (it.hasNext()) {
            appendable.append(f(it.next()));
            while (it.hasNext()) {
                appendable.append(this.a);
                appendable.append(f(it.next()));
            }
        }
        return appendable;
    }

    public final StringBuilder b(StringBuilder sb, Iterator it) {
        try {
            a(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String c(Iterable iterable) {
        return d(iterable.iterator());
    }

    public final String d(Iterator it) {
        return b(new StringBuilder(), it).toString();
    }

    public CharSequence f(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
