package com.daaw;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class G70 {
    public static final a a = new a(null);
    public static final long b = V70.a(0);
    public static final long c = V70.a(1);
    public static final long d = V70.a(2);
    public static final long e = V70.a(3);
    public static final long f = V70.a(4);
    public static final long g = V70.a(259);
    public static final long h = V70.a(260);
    public static final long i = V70.a(261);
    public static final long j = V70.a(262);
    public static final long k = V70.a(263);
    public static final long l = V70.a(280);
    public static final long m = V70.a(281);
    public static final long n = V70.a(282);
    public static final long o = V70.a(283);
    public static final long p = V70.a(5);
    public static final long q = V70.a(6);
    public static final long r = V70.a(19);
    public static final long s = V70.a(20);
    public static final long t = V70.a(21);
    public static final long u = V70.a(22);
    public static final long v = V70.a(23);
    public static final long w = V70.a(268);
    public static final long x = V70.a(269);
    public static final long y = V70.a(270);
    public static final long z = V70.a(271);
    public static final long A = V70.a(24);
    public static final long B = V70.a(25);
    public static final long C = V70.a(26);
    public static final long D = V70.a(27);
    public static final long E = V70.a(28);
    public static final long F = V70.a(7);
    public static final long G = V70.a(8);
    public static final long H = V70.a(9);
    public static final long I = V70.a(10);
    public static final long J = V70.a(11);
    public static final long K = V70.a(12);
    public static final long L = V70.a(13);
    public static final long M = V70.a(14);
    public static final long N = V70.a(15);
    public static final long O = V70.a(16);
    public static final long P = V70.a(81);
    public static final long Q = V70.a(69);
    public static final long R = V70.a(17);
    public static final long S = V70.a(70);
    public static final long T = V70.a(18);
    public static final long U = V70.a(29);
    public static final long V = V70.a(30);
    public static final long W = V70.a(31);
    public static final long X = V70.a(32);
    public static final long Y = V70.a(33);
    public static final long Z = V70.a(34);
    public static final long a0 = V70.a(35);
    public static final long b0 = V70.a(36);
    public static final long c0 = V70.a(37);
    public static final long d0 = V70.a(38);
    public static final long e0 = V70.a(39);
    public static final long f0 = V70.a(40);
    public static final long g0 = V70.a(41);
    public static final long h0 = V70.a(42);
    public static final long i0 = V70.a(43);
    public static final long j0 = V70.a(44);
    public static final long k0 = V70.a(45);
    public static final long l0 = V70.a(46);
    public static final long m0 = V70.a(47);
    public static final long n0 = V70.a(48);
    public static final long o0 = V70.a(49);
    public static final long p0 = V70.a(50);
    public static final long q0 = V70.a(51);
    public static final long r0 = V70.a(52);
    public static final long s0 = V70.a(53);
    public static final long t0 = V70.a(54);
    public static final long u0 = V70.a(55);
    public static final long v0 = V70.a(56);
    public static final long w0 = V70.a(57);
    public static final long x0 = V70.a(58);
    public static final long y0 = V70.a(59);
    public static final long z0 = V70.a(60);
    public static final long A0 = V70.a(61);
    public static final long B0 = V70.a(62);
    public static final long C0 = V70.a(63);
    public static final long D0 = V70.a(64);
    public static final long E0 = V70.a(65);
    public static final long F0 = V70.a(66);
    public static final long G0 = V70.a(67);
    public static final long H0 = V70.a(112);
    public static final long I0 = V70.a(111);
    public static final long J0 = V70.a(113);
    public static final long K0 = V70.a(114);
    public static final long L0 = V70.a(115);
    public static final long M0 = V70.a(116);
    public static final long N0 = V70.a(117);
    public static final long O0 = V70.a(118);
    public static final long P0 = V70.a(119);
    public static final long Q0 = V70.a(120);
    public static final long R0 = V70.a(121);
    public static final long S0 = V70.a(122);
    public static final long T0 = V70.a(123);
    public static final long U0 = V70.a(124);
    public static final long V0 = V70.a(277);
    public static final long W0 = V70.a(278);
    public static final long X0 = V70.a(279);
    public static final long Y0 = V70.a(68);
    public static final long Z0 = V70.a(71);
    public static final long a1 = V70.a(72);
    public static final long b1 = V70.a(76);
    public static final long c1 = V70.a(73);
    public static final long d1 = V70.a(74);
    public static final long e1 = V70.a(75);
    public static final long f1 = V70.a(77);
    public static final long g1 = V70.a(78);
    public static final long h1 = V70.a(79);
    public static final long i1 = V70.a(80);
    public static final long j1 = V70.a(82);
    public static final long k1 = V70.a(83);
    public static final long l1 = V70.a(84);
    public static final long m1 = V70.a(92);
    public static final long n1 = V70.a(93);
    public static final long o1 = V70.a(94);
    public static final long p1 = V70.a(95);
    public static final long q1 = V70.a(96);
    public static final long r1 = V70.a(97);
    public static final long s1 = V70.a(98);
    public static final long t1 = V70.a(99);
    public static final long u1 = V70.a(100);
    public static final long v1 = V70.a(101);
    public static final long w1 = V70.a(102);
    public static final long x1 = V70.a(103);
    public static final long y1 = V70.a(104);
    public static final long z1 = V70.a(105);
    public static final long A1 = V70.a(106);
    public static final long B1 = V70.a(107);
    public static final long C1 = V70.a(108);
    public static final long D1 = V70.a(109);
    public static final long E1 = V70.a(110);
    public static final long F1 = V70.a(188);
    public static final long G1 = V70.a(189);
    public static final long H1 = V70.a(190);
    public static final long I1 = V70.a(191);
    public static final long J1 = V70.a(192);
    public static final long K1 = V70.a(193);
    public static final long L1 = V70.a(194);
    public static final long M1 = V70.a(195);
    public static final long N1 = V70.a(196);
    public static final long O1 = V70.a(197);
    public static final long P1 = V70.a(198);
    public static final long Q1 = V70.a(199);
    public static final long R1 = V70.a(RCHTTPStatusCodes.SUCCESS);
    public static final long S1 = V70.a(RCHTTPStatusCodes.CREATED);
    public static final long T1 = V70.a(202);
    public static final long U1 = V70.a(203);
    public static final long V1 = V70.a(125);
    public static final long W1 = V70.a(131);
    public static final long X1 = V70.a(132);
    public static final long Y1 = V70.a(133);
    public static final long Z1 = V70.a(134);
    public static final long a2 = V70.a(135);
    public static final long b2 = V70.a(136);
    public static final long c2 = V70.a(137);
    public static final long d2 = V70.a(138);
    public static final long e2 = V70.a(139);
    public static final long f2 = V70.a(140);
    public static final long g2 = V70.a(141);
    public static final long h2 = V70.a(142);
    public static final long i2 = V70.a(143);
    public static final long j2 = V70.a(144);
    public static final long k2 = V70.a(145);
    public static final long l2 = V70.a(146);
    public static final long m2 = V70.a(147);
    public static final long n2 = V70.a(148);
    public static final long o2 = V70.a(149);
    public static final long p2 = V70.a(150);
    public static final long q2 = V70.a(151);
    public static final long r2 = V70.a(152);
    public static final long s2 = V70.a(153);
    public static final long t2 = V70.a(154);
    public static final long u2 = V70.a(155);
    public static final long v2 = V70.a(156);
    public static final long w2 = V70.a(157);
    public static final long x2 = V70.a(158);
    public static final long y2 = V70.a(159);
    public static final long z2 = V70.a(160);
    public static final long A2 = V70.a(161);
    public static final long B2 = V70.a(162);
    public static final long C2 = V70.a(163);
    public static final long D2 = V70.a(126);
    public static final long E2 = V70.a(127);
    public static final long F2 = V70.a(85);
    public static final long G2 = V70.a(86);
    public static final long H2 = V70.a(130);
    public static final long I2 = V70.a(87);
    public static final long J2 = V70.a(88);
    public static final long K2 = V70.a(89);
    public static final long L2 = V70.a(90);
    public static final long M2 = V70.a(128);
    public static final long N2 = V70.a(222);
    public static final long O2 = V70.a(129);
    public static final long P2 = V70.a(226);
    public static final long Q2 = V70.a(272);
    public static final long R2 = V70.a(273);
    public static final long S2 = V70.a(274);
    public static final long T2 = V70.a(275);
    public static final long U2 = V70.a(91);
    public static final long V2 = V70.a(164);
    public static final long W2 = V70.a(165);
    public static final long X2 = V70.a(166);
    public static final long Y2 = V70.a(167);
    public static final long Z2 = V70.a(168);
    public static final long a3 = V70.a(169);
    public static final long b3 = V70.a(170);
    public static final long c3 = V70.a(171);
    public static final long d3 = V70.a(172);
    public static final long e3 = V70.a(173);
    public static final long f3 = V70.a(174);
    public static final long g3 = V70.a(175);
    public static final long h3 = V70.a(176);
    public static final long i3 = V70.a(177);
    public static final long j3 = V70.a(178);
    public static final long k3 = V70.a(179);
    public static final long l3 = V70.a(180);
    public static final long m3 = V70.a(181);
    public static final long n3 = V70.a(182);
    public static final long o3 = V70.a(183);
    public static final long p3 = V70.a(184);
    public static final long q3 = V70.a(185);
    public static final long r3 = V70.a(186);
    public static final long s3 = V70.a(187);
    public static final long t3 = V70.a(204);
    public static final long u3 = V70.a(205);
    public static final long v3 = V70.a(206);
    public static final long w3 = V70.a(207);
    public static final long x3 = V70.a(208);
    public static final long y3 = V70.a(209);
    public static final long z3 = V70.a(210);
    public static final long A3 = V70.a(211);
    public static final long B3 = V70.a(212);
    public static final long C3 = V70.a(213);
    public static final long D3 = V70.a(214);
    public static final long E3 = V70.a(215);
    public static final long F3 = V70.a(216);
    public static final long G3 = V70.a(217);
    public static final long H3 = V70.a(218);
    public static final long I3 = V70.a(219);
    public static final long J3 = V70.a(220);
    public static final long K3 = V70.a(221);
    public static final long L3 = V70.a(223);
    public static final long M3 = V70.a(224);
    public static final long N3 = V70.a(276);
    public static final long O3 = V70.a(225);
    public static final long P3 = V70.a(229);
    public static final long Q3 = V70.a(230);
    public static final long R3 = V70.a(231);
    public static final long S3 = V70.a(232);
    public static final long T3 = V70.a(233);
    public static final long U3 = V70.a(234);
    public static final long V3 = V70.a(235);
    public static final long W3 = V70.a(236);
    public static final long X3 = V70.a(237);
    public static final long Y3 = V70.a(238);
    public static final long Z3 = V70.a(239);
    public static final long a4 = V70.a(240);
    public static final long b4 = V70.a(241);
    public static final long c4 = V70.a(242);
    public static final long d4 = V70.a(243);
    public static final long e4 = V70.a(244);
    public static final long f4 = V70.a(245);
    public static final long g4 = V70.a(246);
    public static final long h4 = V70.a(247);
    public static final long i4 = V70.a(248);
    public static final long j4 = V70.a(249);
    public static final long k4 = V70.a(250);
    public static final long l4 = V70.a(251);
    public static final long m4 = V70.a(252);
    public static final long n4 = V70.a(253);
    public static final long o4 = V70.a(254);
    public static final long p4 = V70.a(255);
    public static final long q4 = V70.a(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    public static final long r4 = V70.a(257);
    public static final long s4 = V70.a(258);
    public static final long t4 = V70.a(264);
    public static final long u4 = V70.a(265);
    public static final long v4 = V70.a(266);
    public static final long w4 = V70.a(267);
    public static final long x4 = V70.a(284);
    public static final long y4 = V70.a(285);
    public static final long z4 = V70.a(286);
    public static final long A4 = V70.a(287);
    public static final long B4 = V70.a(288);

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final long a() {
            return G70.f;
        }

        public final long b() {
            return G70.v;
        }

        public final long c() {
            return G70.s;
        }

        public final long d() {
            return G70.t;
        }

        public final long e() {
            return G70.u;
        }

        public final long f() {
            return G70.r;
        }

        public final long g() {
            return G70.F0;
        }

        public final long h() {
            return G70.I0;
        }

        public final long i() {
            return G70.z2;
        }

        public final long j() {
            return G70.A0;
        }

        public a() {
        }
    }

    public static final boolean l(long j5, long j6) {
        return j5 == j6;
    }

    public static long k(long j5) {
        return j5;
    }
}
