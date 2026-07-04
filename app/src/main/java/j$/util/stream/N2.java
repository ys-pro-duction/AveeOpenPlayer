package j$.util.stream;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import j$.util.Objects;
import j$.util.function.IntConsumer$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public class N2 extends R2 implements IntConsumer {
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.R2
    public final void s(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i < i2) {
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.R2
    public final int t(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            e((IntConsumer) consumer);
        } else {
            if (F3.a) {
                F3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            j$.com.android.tools.r8.a.k((M2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.R2
    public final Object[] w() {
        return new int[8][];
    }

    @Override // j$.util.stream.R2
    public final Object c(int i) {
        return new int[i];
    }

    @Override // java.util.function.IntConsumer
    public void accept(int i) {
        x();
        int[] iArr = (int[]) this.e;
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.V vSpliterator = spliterator();
        Objects.requireNonNull(vSpliterator);
        return new j$.util.e0(vSpliterator);
    }

    @Override // j$.util.stream.R2, java.lang.Iterable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public j$.util.V spliterator() {
        return new M2(this, 0, this.c, 0, this.b);
    }

    public final String toString() {
        int[] iArr = (int[]) d();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(iArr, RCHTTPStatusCodes.SUCCESS)));
    }
}
