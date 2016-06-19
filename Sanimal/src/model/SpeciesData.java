/*
 * Author: David Slovikosky
 * Mod: Afraid of the Dark
 * Ideas and Textures: Michael Albertson
 */
package model;

import java.util.ArrayList;
import java.util.List;

public class SpeciesData
{
	private List<Species> species = new ArrayList<Species>();

	public void addSpecies(Species species)
	{
		this.species.add(species);
	}

	public void removeSpecies(Species species)
	{
		this.species.remove(species);
	}

	public List<Species> getRegisteredSpecies()
	{
		return species;
	}
}
