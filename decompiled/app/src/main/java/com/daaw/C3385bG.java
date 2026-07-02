package com.daaw;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: renamed from: com.daaw.bG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3385bG {
    public final b a;

    /* JADX INFO: renamed from: com.daaw.bG$a */
    public static class a extends b {
        public final TextView a;
        public final YF b;
        public boolean c = true;

        public a(TextView textView) {
            this.a = textView;
            this.b = new YF(textView);
        }

        @Override // com.daaw.C3385bG.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // com.daaw.C3385bG.b
        public boolean b() {
            return this.c;
        }

        @Override // com.daaw.C3385bG.b
        public void c(boolean z) {
            if (z) {
                l();
            }
        }

        @Override // com.daaw.C3385bG.b
        public void d(boolean z) {
            this.c = z;
            l();
            k();
        }

        @Override // com.daaw.C3385bG.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return this.c ? m(transformationMethod) : j(transformationMethod);
        }

        public final InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.b;
            return inputFilterArr2;
        }

        public final SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof YF) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        public final InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayG = g(inputFilterArr);
            if (sparseArrayG.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayG.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (sparseArrayG.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        public void i(boolean z) {
            this.c = z;
        }

        public final TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof C3942dG ? ((C3942dG) transformationMethod).a() : transformationMethod;
        }

        public final void k() {
            this.a.setFilters(a(this.a.getFilters()));
        }

        public void l() {
            this.a.setTransformationMethod(e(this.a.getTransformationMethod()));
        }

        public final TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof C3942dG) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C3942dG(transformationMethod);
        }
    }

    /* JADX INFO: renamed from: com.daaw.bG$b */
    public static class b {
        public abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract boolean b();

        public abstract void c(boolean z);

        public abstract void d(boolean z);

        public abstract TransformationMethod e(TransformationMethod transformationMethod);
    }

    /* JADX INFO: renamed from: com.daaw.bG$c */
    public static class c extends b {
        public final a a;

        public c(TextView textView) {
            this.a = new a(textView);
        }

        @Override // com.daaw.C3385bG.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.a.a(inputFilterArr);
        }

        @Override // com.daaw.C3385bG.b
        public boolean b() {
            return this.a.b();
        }

        @Override // com.daaw.C3385bG.b
        public void c(boolean z) {
            if (f()) {
                return;
            }
            this.a.c(z);
        }

        @Override // com.daaw.C3385bG.b
        public void d(boolean z) {
            if (f()) {
                this.a.i(z);
            } else {
                this.a.d(z);
            }
        }

        @Override // com.daaw.C3385bG.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.a.e(transformationMethod);
        }

        public final boolean f() {
            return !androidx.emoji2.text.c.i();
        }
    }

    public C3385bG(TextView textView, boolean z) {
        AbstractC8621ty0.h(textView, "textView cannot be null");
        if (z) {
            this.a = new a(textView);
        } else {
            this.a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.a.a(inputFilterArr);
    }

    public boolean b() {
        return this.a.b();
    }

    public void c(boolean z) {
        this.a.c(z);
    }

    public void d(boolean z) {
        this.a.d(z);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.a.e(transformationMethod);
    }
}
