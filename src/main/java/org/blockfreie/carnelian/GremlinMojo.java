package org.blockfreie.carnelian;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.tinkerpop.gremlin.console.Console;
/**
 * Run gremlin
 *
 */
@Mojo( name = "gremlin")
public class GremlinMojo extends AbstractMojo
{
    public void execute() throws MojoExecutionException
    {   Console.main(new String[]{});
    }
}
