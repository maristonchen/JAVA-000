package com.mariston.week07.mapstruct;

import java.util.List;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/12/10 22:15
 */
public interface BaseMapStruct<P, D, V, Q> {

    P dToP(D d);

    P vToP(V v);

    P qToP(Q q);

    D pToD(P p);

    V pToV(P p);

    Q pToQ(P p);

    Q dToQ(D d);

    List<D> pToD(List<P> pList);

    List<V> pToV(List<P> pList);


}
