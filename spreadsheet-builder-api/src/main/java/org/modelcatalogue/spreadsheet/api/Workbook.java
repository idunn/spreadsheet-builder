package org.modelcatalogue.spreadsheet.api;

import java.util.Collection;

public interface Workbook {

    Collection<? extends Sheet> getSheets();

}
