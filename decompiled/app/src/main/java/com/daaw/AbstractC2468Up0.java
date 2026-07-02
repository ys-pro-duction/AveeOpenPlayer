package com.daaw;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.Up0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2468Up0 {
    public static final Logger a = Logger.getLogger(AbstractC2468Up0.class.getName());

    /* JADX INFO: renamed from: com.daaw.Up0$a */
    public class a implements InterfaceC9600xT0, AutoCloseable {
        public final /* synthetic */ M31 B;
        public final /* synthetic */ OutputStream C;

        public a(M31 m31, OutputStream outputStream) {
            this.B = m31;
            this.C = outputStream;
        }

        @Override // com.daaw.InterfaceC9600xT0
        public void O0(C4057dh c4057dh, long j) throws IOException {
            AbstractC7675qb1.b(c4057dh.C, 0L, j);
            while (j > 0) {
                this.B.c();
                FO0 fo0 = c4057dh.B;
                int iMin = (int) Math.min(j, fo0.c - fo0.b);
                this.C.write(fo0.a, fo0.b, iMin);
                int i = fo0.b + iMin;
                fo0.b = i;
                long j2 = iMin;
                j -= j2;
                c4057dh.C -= j2;
                if (i == fo0.c) {
                    c4057dh.B = fo0.b();
                    YO0.a(fo0);
                }
            }
        }

        @Override // com.daaw.InterfaceC9600xT0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.C.close();
        }

        @Override // com.daaw.InterfaceC9600xT0, java.io.Flushable
        public void flush() throws IOException {
            this.C.flush();
        }

        public String toString() {
            return "sink(" + this.C + ")";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Up0$b */
    public class b implements PU0, AutoCloseable {
        public final /* synthetic */ M31 B;
        public final /* synthetic */ InputStream C;

        public b(M31 m31, InputStream inputStream) {
            this.B = m31;
            this.C = inputStream;
        }

        @Override // com.daaw.PU0
        public long A0(C4057dh c4057dh, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (j == 0) {
                return 0L;
            }
            try {
                this.B.c();
                FO0 fo0I1 = c4057dh.i1(1);
                int i = this.C.read(fo0I1.a, fo0I1.c, (int) Math.min(j, 8192 - fo0I1.c));
                if (i != -1) {
                    fo0I1.c += i;
                    long j2 = i;
                    c4057dh.C += j2;
                    return j2;
                }
                if (fo0I1.b != fo0I1.c) {
                    return -1L;
                }
                c4057dh.B = fo0I1.b();
                YO0.a(fo0I1);
                return -1L;
            } catch (AssertionError e) {
                if (AbstractC2468Up0.c(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }

        @Override // com.daaw.PU0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.C.close();
        }

        public String toString() {
            return "source(" + this.C + ")";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Up0$c */
    public class c extends C0507Cb {
        public final /* synthetic */ Socket k;

        public c(Socket socket) {
            this.k = socket;
        }

        @Override // com.daaw.C0507Cb
        public IOException k(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.daaw.C0507Cb
        public void p() {
            try {
                this.k.close();
            } catch (AssertionError e) {
                if (!AbstractC2468Up0.c(e)) {
                    throw e;
                }
                AbstractC2468Up0.a.log(Level.WARNING, "Failed to close timed out socket " + this.k, (Throwable) e);
            } catch (Exception e2) {
                AbstractC2468Up0.a.log(Level.WARNING, "Failed to close timed out socket " + this.k, (Throwable) e2);
            }
        }
    }

    public static InterfaceC7145oh a(InterfaceC9600xT0 interfaceC9600xT0) {
        return new NE0(interfaceC9600xT0);
    }

    public static InterfaceC7424ph b(PU0 pu0) {
        return new OE0(pu0);
    }

    public static boolean c(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static InterfaceC9600xT0 d(OutputStream outputStream, M31 m31) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (m31 != null) {
            return new a(m31, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static InterfaceC9600xT0 e(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        C0507Cb c0507CbI = i(socket);
        return c0507CbI.n(d(socket.getOutputStream(), c0507CbI));
    }

    public static PU0 f(InputStream inputStream) {
        return g(inputStream, new M31());
    }

    public static PU0 g(InputStream inputStream, M31 m31) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (m31 != null) {
            return new b(m31, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static PU0 h(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        C0507Cb c0507CbI = i(socket);
        return c0507CbI.o(g(socket.getInputStream(), c0507CbI));
    }

    public static C0507Cb i(Socket socket) {
        return new c(socket);
    }
}
