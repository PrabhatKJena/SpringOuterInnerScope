package edu.pk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by pkumarjena on 12/23/16.
 */
@Component
@Scope("singleton")
public class Outer {
    @Autowired
    private Inner inner;

    @Lookup
    public Inner getInner() {
        return inner;
    }
}
