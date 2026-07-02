package com.daaw;

/* JADX INFO: renamed from: com.daaw.nh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6866nh {
    public static final C7718qk a = new C7718qk(-1, null, null, 0);
    public static final int b = K01.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
    public static final int c = K01.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
    public static final YZ0 d = new YZ0("BUFFERED");
    public static final YZ0 e = new YZ0("SHOULD_BUFFER");
    public static final YZ0 f = new YZ0("S_RESUMING_BY_RCV");
    public static final YZ0 g = new YZ0("RESUMING_BY_EB");
    public static final YZ0 h = new YZ0("POISONED");
    public static final YZ0 i = new YZ0("DONE_RCV");
    public static final YZ0 j = new YZ0("INTERRUPTED_SEND");
    public static final YZ0 k = new YZ0("INTERRUPTED_RCV");
    public static final YZ0 l = new YZ0("CHANNEL_CLOSED");
    public static final YZ0 m = new YZ0("SUSPEND");
    public static final YZ0 n = new YZ0("SUSPEND_NO_WAITER");
    public static final YZ0 o = new YZ0("FAILED");
    public static final YZ0 p = new YZ0("NO_RECEIVE_RESULT");
    public static final YZ0 q = new YZ0("CLOSE_HANDLER_CLOSED");
    public static final YZ0 r = new YZ0("CLOSE_HANDLER_INVOKED");
    public static final YZ0 s = new YZ0("NO_CLOSE_CAUSE");

    /* JADX INFO: renamed from: com.daaw.nh$a */
    public /* synthetic */ class a extends AbstractC9591xR implements InterfaceC3429bR {
        public static final a B = new a();

        public a() {
            super(2, AbstractC6866nh.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return o(((Number) obj).longValue(), (C7718qk) obj2);
        }

        public final C7718qk o(long j, C7718qk c7718qk) {
            return AbstractC6866nh.x(j, c7718qk);
        }
    }

    public static final long A(int i2) {
        if (i2 == 0) {
            return 0L;
        }
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        return Long.MAX_VALUE;
    }

    public static final boolean B(InterfaceC3788cj interfaceC3788cj, Object obj, NQ nq) {
        Object objG = interfaceC3788cj.G(obj, null, nq);
        if (objG == null) {
            return false;
        }
        interfaceC3788cj.M(objG);
        return true;
    }

    public static /* synthetic */ boolean C(InterfaceC3788cj interfaceC3788cj, Object obj, NQ nq, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            nq = null;
        }
        return B(interfaceC3788cj, obj, nq);
    }

    public static final long v(long j2, boolean z) {
        return (z ? 4611686018427387904L : 0L) + j2;
    }

    public static final long w(long j2, int i2) {
        return (((long) i2) << 60) + j2;
    }

    public static final C7718qk x(long j2, C7718qk c7718qk) {
        return new C7718qk(j2, c7718qk, c7718qk.u(), 0);
    }

    public static final InterfaceC8381t60 y() {
        return a.B;
    }

    public static final YZ0 z() {
        return l;
    }
}
