package com.daaw;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class Z11 {
    public float c;
    public L11 f;
    public final TextPaint a = new TextPaint(1);
    public final N11 b = new a();
    public boolean d = true;
    public WeakReference e = new WeakReference(null);

    public class a extends N11 {
        public a() {
        }

        @Override // com.daaw.N11
        public void a(int i) {
            Z11.this.d = true;
            b bVar = (b) Z11.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // com.daaw.N11
        public void b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            Z11.this.d = true;
            b bVar = (b) Z11.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public Z11(b bVar) {
        g(bVar);
    }

    public final float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.a.measureText(charSequence, 0, charSequence.length());
    }

    public L11 d() {
        return this.f;
    }

    public TextPaint e() {
        return this.a;
    }

    public float f(String str) {
        if (!this.d) {
            return this.c;
        }
        float fC = c(str);
        this.c = fC;
        this.d = false;
        return fC;
    }

    public void g(b bVar) {
        this.e = new WeakReference(bVar);
    }

    public void h(L11 l11, Context context) {
        if (this.f != l11) {
            this.f = l11;
            if (l11 != null) {
                l11.o(context, this.a, this.b);
                b bVar = (b) this.e.get();
                if (bVar != null) {
                    this.a.drawableState = bVar.getState();
                }
                l11.n(context, this.a, this.b);
                this.d = true;
            }
            b bVar2 = (b) this.e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z) {
        this.d = z;
    }

    public void j(Context context) {
        this.f.n(context, this.a, this.b);
    }
}
