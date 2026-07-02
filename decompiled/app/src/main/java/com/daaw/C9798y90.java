package com.daaw;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;

/* JADX INFO: renamed from: com.daaw.y90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9798y90 {
    public final O90 a;
    public final O90 b;
    public final O90 c;

    /* JADX INFO: renamed from: com.daaw.y90$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ int B;
        public final /* synthetic */ CharSequence C;
        public final /* synthetic */ TextPaint D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, CharSequence charSequence, TextPaint textPaint) {
            super(0);
            this.B = i;
            this.C = charSequence;
            this.D = textPaint;
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BoringLayout.Metrics invoke() {
            return C7698qg.a.b(this.C, this.D, AbstractC10043z21.e(this.B));
        }
    }

    /* JADX INFO: renamed from: com.daaw.y90$b */
    public static final class b extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ CharSequence C;
        public final /* synthetic */ TextPaint D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CharSequence charSequence, TextPaint textPaint) {
            super(0);
            this.C = charSequence;
            this.D = textPaint;
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            float desiredWidth;
            BoringLayout.Metrics metricsA = C9798y90.this.a();
            if (metricsA != null) {
                desiredWidth = metricsA.width;
            } else {
                CharSequence charSequence = this.C;
                desiredWidth = Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.D);
            }
            if (A90.e(desiredWidth, this.C, this.D)) {
                desiredWidth += 0.5f;
            }
            return Float.valueOf(desiredWidth);
        }
    }

    /* JADX INFO: renamed from: com.daaw.y90$c */
    public static final class c extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ CharSequence B;
        public final /* synthetic */ TextPaint C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CharSequence charSequence, TextPaint textPaint) {
            super(0);
            this.B = charSequence;
            this.C = textPaint;
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(A90.c(this.B, this.C));
        }
    }

    public C9798y90(CharSequence charSequence, TextPaint textPaint, int i) {
        G10.g(charSequence, "charSequence");
        G10.g(textPaint, "textPaint");
        EnumC7395pb0 enumC7395pb0 = EnumC7395pb0.D;
        this.a = AbstractC3192ab0.b(enumC7395pb0, new a(i, charSequence, textPaint));
        this.b = AbstractC3192ab0.b(enumC7395pb0, new c(charSequence, textPaint));
        this.c = AbstractC3192ab0.b(enumC7395pb0, new b(charSequence, textPaint));
    }

    public final BoringLayout.Metrics a() {
        return (BoringLayout.Metrics) this.a.getValue();
    }

    public final float b() {
        return ((Number) this.c.getValue()).floatValue();
    }

    public final float c() {
        return ((Number) this.b.getValue()).floatValue();
    }
}
