package org.geomajas.sld.client.model.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import com.google.web.bindery.event.shared.HandlerRegistration;


public class SldRemovedEvent  extends GwtEvent<SldRemovedEvent.SldRemovedHandler> {

	public SldRemovedEvent() {
		// Possibly for serialization.
	}

	public static void fire(HasHandlers source) {
		SldRemovedEvent eventInstance = new SldRemovedEvent();
		source.fireEvent(eventInstance);
	}

	public static void fire(HasHandlers source, SldRemovedEvent eventInstance) {
		source.fireEvent(eventInstance);
	}

	/**
	 * {@link HasHandlers} indicator for this event.
	 * 
	 * @author Jan De Moerloose
	 * 
	 */
	public interface HasSldRemovedHandlers extends HasHandlers {

		HandlerRegistration addSldRemovedHandler(SldRemovedHandler handler);
	}

	/**
	 * {@link EventHandler} interface for this event.
	 * 
	 * @author Jan De Moerloose
	 * 
	 */
	public interface SldRemovedHandler extends EventHandler {

		/**
		 * Notifies side content child presenter to reveal itself.
		 * 
		 * @param event the event
		 */
		void onSldRemoved(SldRemovedEvent event);
	}

	private static final Type<SldRemovedHandler> TYPE = new Type<SldRemovedHandler>();

	public static Type<SldRemovedHandler> getType() {
		return TYPE;
	}

	@Override
	public Type<SldRemovedHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(SldRemovedHandler handler) {
		handler.onSldRemoved(this);
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "SldRemovedEvent[" + "]";
	}
}