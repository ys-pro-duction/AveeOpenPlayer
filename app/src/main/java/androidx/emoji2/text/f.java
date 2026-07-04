package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import com.daaw.AbstractC4919gk0;
import com.daaw.AbstractC8621ty0;
import com.daaw.C4640fk0;
import com.daaw.S41;
import com.daaw.Z81;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final C4640fk0 a;
    public final char[] b;
    public final a c = new a(1024);
    public final Typeface d;

    public static class a {
        public final SparseArray a;
        public Z81 b;

        public a() {
            this(1);
        }

        public a a(int i) {
            SparseArray sparseArray = this.a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i);
        }

        public final Z81 b() {
            return this.b;
        }

        public void c(Z81 z81, int i, int i2) {
            a aVarA = a(z81.b(i));
            if (aVarA == null) {
                aVarA = new a();
                this.a.put(z81.b(i), aVarA);
            }
            if (i2 > i) {
                aVarA.c(z81, i + 1, i2);
            } else {
                aVarA.b = z81;
            }
        }

        public a(int i) {
            this.a = new SparseArray(i);
        }
    }

    public f(Typeface typeface, C4640fk0 c4640fk0) {
        this.d = typeface;
        this.a = c4640fk0;
        this.b = new char[c4640fk0.k() * 2];
        a(c4640fk0);
    }

    public static f b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            S41.a("EmojiCompat.MetadataRepo.create");
            return new f(typeface, AbstractC4919gk0.b(byteBuffer));
        } finally {
            S41.b();
        }
    }

    public final void a(C4640fk0 c4640fk0) {
        int iK = c4640fk0.k();
        for (int i = 0; i < iK; i++) {
            Z81 z81 = new Z81(this, i);
            Character.toChars(z81.f(), this.b, i * 2);
            h(z81);
        }
    }

    public char[] c() {
        return this.b;
    }

    public C4640fk0 d() {
        return this.a;
    }

    public int e() {
        return this.a.l();
    }

    public a f() {
        return this.c;
    }

    public Typeface g() {
        return this.d;
    }

    public void h(Z81 z81) {
        AbstractC8621ty0.h(z81, "emoji metadata cannot be null");
        AbstractC8621ty0.b(z81.c() > 0, "invalid metadata codepoint length");
        this.c.c(z81, 0, z81.c() - 1);
    }
}
