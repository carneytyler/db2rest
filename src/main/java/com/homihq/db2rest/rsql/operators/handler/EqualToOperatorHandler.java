package com.homihq.db2rest.rsql.operators.handler;

import com.homihq.db2rest.rsql.operators.OperatorHandler;
import org.jooq.Condition;
import static org.jooq.impl.DSL.*;


public class EqualToOperatorHandler implements OperatorHandler {

    @Override
    public Condition handle(String columnName, String value, Class type) {
        return
        field(columnName).eq(val(parseValue(value,type)));


    }

}
